package com.jk.entity;

import java.io.Serializable;

public class RiZhi implements Serializable{

    private static final long serialVersionUID = -1922795313395798181L;

    private Integer rid;

    private String rtype;

    private String rname;

    private String rtime;

    public Integer getRid() {
        return rid;
    }

    public String getRtype() {
        return rtype;
    }

    public String getRname() {
        return rname;
    }

    public String getRtime() {
        return rtime;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public void setRtype(String rtype) {
        this.rtype = rtype;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public void setRtime(String rtime) {
        this.rtime = rtime;
    }

    @Override
    public String toString() {
        return "RiZhi{" +
                "rid=" + rid +
                ", rtype='" + rtype + '\'' +
                ", rname='" + rname + '\'' +
                ", rtime='" + rtime + '\'' +
                '}';
    }
}
