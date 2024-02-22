package com.design.patterns.creational.factory;

public class NBEBank implements IBank{

    @Override
    public String withdraw() {
        return "Your request has been handled by NBE Bank";
    }
}
