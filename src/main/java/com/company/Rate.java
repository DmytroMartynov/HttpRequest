package com.company;

public class Rate {
    private String baseCurrency;
    private String currency;
    private String saleRateNB;
    private String purchaseRateNB;
    private String saleRate;
    private String purchaseRate;

    public Rate() {
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getSaleRateNB() {
        return saleRateNB;
    }

    public void setSaleRateNB(String saleRateNB) {
        this.saleRateNB = saleRateNB;
    }

    public String getPurchaseRateNB() {
        return purchaseRateNB;
    }

    public void setPurchaseRateNB(String purchaseRateNB) {
        this.purchaseRateNB = purchaseRateNB;
    }

    public String getSaleRate() {
        return saleRate;
    }

    public void setSaleRate(String saleRate) {
        this.saleRate = saleRate;
    }

    public String getPurchaseRate() {
        return purchaseRate;
    }

    public void setPurchaseRate(String purchaseRate) {
        this.purchaseRate = purchaseRate;
    }
}