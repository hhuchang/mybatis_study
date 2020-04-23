package com.c2.reflect;

public class A<T> {
    private String appname;

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    class InnerA<I>{

    }
}
