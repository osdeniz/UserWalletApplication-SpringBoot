package com.bitlo.UserWalletApplication.dto;

import java.util.Date;

public class WalletDto {

    private Long id;

    private String name;

    private String description;

    private Integer accountNumber;

    private Double currenciesTypeUsdt;

    private Double currenciesTypeBtc;

    private Double currenciesTypeEth;

    private Double currenciesTypeTl;

    private Double currentBalance;

    private String transactions;

    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getCurrenciesTypeUsdt() {
        return currenciesTypeUsdt;
    }

    public void setCurrenciesTypeUsdt(Double currenciesTypeUsdt) {
        this.currenciesTypeUsdt = currenciesTypeUsdt;
    }

    public Double getCurrenciesTypeBtc() {
        return currenciesTypeBtc;
    }

    public void setCurrenciesTypeBtc(Double currenciesTypeBtc) {
        this.currenciesTypeBtc = currenciesTypeBtc;
    }

    public Double getCurrenciesTypeEth() {
        return currenciesTypeEth;
    }

    public void setCurrenciesTypeEth(Double currenciesTypeEth) {
        this.currenciesTypeEth = currenciesTypeEth;
    }

    public Double getCurrenciesTypeTl() {
        return currenciesTypeTl;
    }

    public void setCurrenciesTypeTl(Double currenciesTypeTl) {
        this.currenciesTypeTl = currenciesTypeTl;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getTransactions() {
        return transactions;
    }

    public void setTransactions(String transactions) {
        this.transactions = transactions;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
