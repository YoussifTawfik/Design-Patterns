package com.design.patterns.Creational.Factory;

public class NBEBank implements IBank{

    @Override
    public String withdraw() {
        return "Your request has been handled by NBE Bank";
    }
}
