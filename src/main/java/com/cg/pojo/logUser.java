package com.cg.pojo;

public class logUser {
    private String logname;
    private String logword;

    @Override
    public String toString() {
        return "logUser{" +
                "logname='" + logname + '\'' +
                ", logword='" + logword + '\'' +
                '}';
    }

    public logUser() {
    }

    public logUser(String logname, String logword) {
        this.logname = logname;
        this.logword = logword;
    }

    public String getLogname() {
        return logname;
    }

    public void setLogname(String logname) {
        this.logname = logname;
    }

    public String getLogword() {
        return logword;
    }

    public void setLogword(String logword) {
        this.logword = logword;
    }
}
