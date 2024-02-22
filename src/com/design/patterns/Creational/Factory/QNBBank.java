package com.design.patterns.creational.factory;

public class QNBBank implements IBank{


    @Override
    public String withdraw() {
        return "Your request has been handled by QNB Bank";
    }
}
