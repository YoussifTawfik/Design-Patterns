package com.design.patterns.creational.factory;

public enum Banks {

    CIB("123456"),NBE("111111"),QNB("222222");

    private final String name;

    Banks(String value){
        this.name=value;
    }

    public String getValue(){
        return this.name;
    }
}
