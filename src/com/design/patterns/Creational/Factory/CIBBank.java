package com.design.patterns.Creational.Factory;

public class CIBBank implements IBank{


    @Override
    public String withdraw() {
        return "Your request has been handled by CIB Bank";
    }
}
