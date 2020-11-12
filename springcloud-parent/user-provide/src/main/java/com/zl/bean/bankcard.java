package com.zl.bean;

import java.io.Serializable;
import java.util.Date;

public class bankcard implements Serializable {
    private Integer id;
    private Integer accountid;
    private Integer cardnumber;
    private Integer balance;
    private Integer state;
    private String bankpwd;
    private Date opendate;
    private String address;
    private String currency;
    private Integer quota;
    private Integer bankid;

    @Override
    public String toString() {
        return "bankcard{" +
                "id=" + id +
                ", accountid=" + accountid +
                ", cardnumber=" + cardnumber +
                ", balance=" + balance +
                ", state=" + state +
                ", bankpwd='" + bankpwd + '\'' +
                ", opendate=" + opendate +
                ", address='" + address + '\'' +
                ", currency='" + currency + '\'' +
                ", quota=" + quota +
                ", bankid=" + bankid +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public Integer getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(Integer cardnumber) {
        this.cardnumber = cardnumber;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getBankpwd() {
        return bankpwd;
    }

    public void setBankpwd(String bankpwd) {
        this.bankpwd = bankpwd;
    }

    public Date getOpendate() {
        return opendate;
    }

    public void setOpendate(Date opendate) {
        this.opendate = opendate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public Integer getBankid() {
        return bankid;
    }

    public void setBankid(Integer bankid) {
        this.bankid = bankid;
    }
}
