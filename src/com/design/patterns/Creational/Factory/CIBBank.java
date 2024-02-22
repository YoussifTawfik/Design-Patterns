package com.design.patterns.creational.factory;

public class CIBBank implements IBank{


    @Override
    public String withdraw() {
        return "Your request has been handled by CIB Bank";
    }
}
