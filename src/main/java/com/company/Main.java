package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Enter information like this: day(01).mounth(02).year(2014)");
            Scanner in = new Scanner(System.in);
            String num = in.nextLine();
            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            Date date = dateFormat.parse(num);
            String output = dateFormat.format(date);
            String response = HttpUtil1.sendRequest(
                    "https://api.privatbank.ua/p24api/exchange_rates?json=true&date="+output);
            System.out.println(response);

        } catch (Exception e) {
            System.out.println("Please enter the correct datatype");
        }

    }
}
