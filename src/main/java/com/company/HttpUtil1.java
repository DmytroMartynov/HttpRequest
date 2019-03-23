package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUtil1 {


    public static String sendRequest(String url) {
        HttpURLConnection urlConnection = null;
        String result = null;
        String dateResult = null;
        try {
            URL requestUrl = new URL(url);

            urlConnection = (HttpURLConnection) requestUrl.openConnection();

            ObjectMapper objectMapper = new ObjectMapper();

            ExchangeRates exchangeRates = objectMapper.readValue(urlConnection.getInputStream(), ExchangeRates.class);

            dateResult = exchangeRates.getDate();

            result = exchangeRates.getExchangeRate().stream()
                    .filter(rate -> "USD".equals(rate.getCurrency()))
                    .map(Rate::getSaleRate)
                    .findFirst().orElse(null);

            if (dateResult == null || result == null) {

                System.out.println("Dont have information for this date :(");
                System.exit(0);
            }

        } catch (Exception e) {
            System.out.println("sendRequest failed " + e);
        } finally {
            urlConnection.disconnect();
        }
        return "date: " + dateResult + " USD: " + result;
    }
}
