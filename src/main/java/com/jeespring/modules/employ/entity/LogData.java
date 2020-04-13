package com.jeespring.modules.employ.entity;


import com.jeespring.common.persistence.AbstractBaseEntity;

import java.util.List;

/**
 * Created by Administrator on 2020/4/10.
 */
public class LogData extends AbstractBaseEntity<LogData> {

    private String eno;
    private String uuid;
    private String scandatetime;
    private String macno;
    private String operatorno;
    private String base64;
    private String icCard;
    private Double temperature;
    private List<UserCardData> data;

    public String getEno() {
        return eno;
    }

    public void setEno(String eno) {
        this.eno = eno;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getScandatetime() {
        return scandatetime;
    }

    public void setScandatetime(String scandatetime) {
        this.scandatetime = scandatetime;
    }

    public String getMacno() {
        return macno;
    }

    public void setMacno(String macno) {
        this.macno = macno;
    }

    public String getOperatorno() {
        return operatorno;
    }

    public void setOperatorno(String operatorno) {
        this.operatorno = operatorno;
    }

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }

    public String getIcCard() {
        return icCard;
    }

    public void setIcCard(String icCard) {
        this.icCard = icCard;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public List<UserCardData> getData() {
        return data;
    }

    public void setData(List<UserCardData> data) {
        this.data = data;
    }
}
