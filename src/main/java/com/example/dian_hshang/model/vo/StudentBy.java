package com.example.dian_hshang.model.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class StudentBy {

    private String name;
    private  Integer pageSize;
    private Integer currpage;
    private  Integer count;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date kdata;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date jdate;

    private String peoples;

    private List<String> ps;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<String> getPs() {
        return ps;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrpage() {
        return currpage;
    }

    public void setCurrpage(Integer currpage) {
        this.currpage = currpage;
    }

    public void setPs(List<String> ps) {
        this.ps = ps;
    }

    public String getPeoples() {
        return peoples;
    }

    public void setPeoples(String peoples) {
        this.peoples = peoples;
    }

    public Date getKdata() {
        return kdata;
    }

    public void setKdata(Date kdata) {
        this.kdata = kdata;
    }

    public Date getJdate() {
        return jdate;
    }

    public void setJdate(Date jdate) {
        this.jdate = jdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
