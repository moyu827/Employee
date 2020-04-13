package com.jeespring.modules.employ.entity;

/**
 * Created by Administrator on 2020/4/10.
 */
public class UserCardData {
    private String idcardno;
    private String name;
    private int gender;
    private String nation;
    private String birthday;
    private String address;
    private String idcard_photo;

    public String getIdcardno() {
        return idcardno;
    }

    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdcard_photo() {
        return idcard_photo;
    }

    public void setIdcard_photo(String idcard_photo) {
        this.idcard_photo = idcard_photo;
    }
}
