package com.bitlo.UserWalletApplication.entity;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "WALLET_TABLE")
public class WalletEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long id;

    @Column(name="NAME")
    private String name;

    @Column(name="DESCRIPTION")
    private String description;

    @Column(name="ACCOUNTNUMBER")
    private Integer accountNumber;

    @Column(name="USDTCURRENCIESTYPES")
    private Double currenciesTypesUsdt;

    @Column(name="BTCCURRENCIESTYPES")
    private Double currenciesTypesBtc;

    @Column(name="ETHTCURRENCIESTYPES")
    private Double currenciesTypesEth;

    @Column(name="TLCURRENCIESTYPES")
    private Double currenciesTypesTl;

    @Column(name="CURRENTBALANCE")
    private Double currentBalance;

    @Column(name="TRANSACTİONS")
    private String transactions;

    @Column(name ="CREATEDATE" )
    private Date createDate;



    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
    private UserEntity user;

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

    public Double getCurrenciesTypesUsdt() {
        return currenciesTypesUsdt;
    }

    public void setCurrenciesTypesUsdt(Double currenciesTypesUsdt) {
        this.currenciesTypesUsdt = currenciesTypesUsdt;
    }

    public Double getCurrenciesTypesBtc() {
        return currenciesTypesBtc;
    }

    public void setCurrenciesTypesBtc(Double currenciesTypesBtc) {
        this.currenciesTypesBtc = currenciesTypesBtc;
    }

    public Double getCurrenciesTypesEth() {
        return currenciesTypesEth;
    }

    public void setCurrenciesTypesEth(Double currenciesTypesEth) {
        this.currenciesTypesEth = currenciesTypesEth;
    }

    public Double getCurrenciesTypesTl() {
        return currenciesTypesTl;
    }

    public void setCurrenciesTypesTl(Double currenciesTypesTl) {
        this.currenciesTypesTl = currenciesTypesTl;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
