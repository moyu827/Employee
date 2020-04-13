package com.jeespring.modules.employ.entity;

import com.jeespring.common.persistence.AbstractBaseEntity;

import java.util.List;

/**
 * Created by Administrator on 2020/4/10.
 */
public class UploadpassedLog extends AbstractBaseEntity<UploadpassedLog> {
    private String code;
    private String pass;
    private List<LogData> data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public List<LogData> getData() {
        return data;
    }

    public void setData(List<LogData> data) {
        this.data = data;
    }
}
