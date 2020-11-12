package com.zl.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Personalaccount implements Serializable {
    private Integer id;
    private Integer userid;
    private String pwd;
    private String name;
    private Integer idcard;
    private Integer phone;
    private Integer state;
    private String sex;
    private Date birthday;
    private Date openingtime;
    private String bankdeposit;
    private List<bankcard> bankcards;

    @Override
    public String toString() {
        return "Personalaccount{" +
                "id=" + id +
                ", userid=" + userid +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", idcard=" + idcard +
                ", phone=" + phone +
                ", state=" + state +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", openingtime=" + openingtime +
                ", bankdeposit='" + bankdeposit + '\'' +
                ", bankcards=" + bankcards +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdcard() {
        return idcard;
    }

    public void setIdcard(Integer idcard) {
        this.idcard = idcard;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getOpeningtime() {
        return openingtime;
    }

    public void setOpeningtime(Date openingtime) {
        this.openingtime = openingtime;
    }

    public String getBankdeposit() {
        return bankdeposit;
    }

    public void setBankdeposit(String bankdeposit) {
        this.bankdeposit = bankdeposit;
    }

    public List<bankcard> getBankcards() {
        return bankcards;
    }

    public void setBankcards(List<bankcard> bankcards) {
        this.bankcards = bankcards;
    }
}
