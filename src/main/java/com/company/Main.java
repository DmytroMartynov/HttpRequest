package com.company;

public class Main {
    public static void main(String[] args) {

        long time = System.currentTimeMillis();
        String response = HttpUtil.sendRequest("https://api.privatbank.ua/p24api/exchange_rates?json=true&date=01.12.2014",null,null);
        time = System.currentTimeMillis()-time;

        System.out.println(response);
        System.out.println("Request time: " + time/1000.0 + "s");
    }
}
