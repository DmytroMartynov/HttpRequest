package com.company;

import java.io.Serializable;
import java.util.List;

public class ExchangeRates implements Serializable {
    private String date;
    private String bank;
    private String baseCurrency;
    private String baseCurrencyLit;
    private List< Rate > exchangeRate;

    public ExchangeRates() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getBaseCurrencyLit() {
        return baseCurrencyLit;
    }

    public void setBaseCurrencyLit(String baseCurrencyLit) {
        this.baseCurrencyLit = baseCurrencyLit;
    }

    public List< Rate > getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(List< Rate > exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}


