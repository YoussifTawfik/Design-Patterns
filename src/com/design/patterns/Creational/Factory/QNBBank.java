package com.design.patterns.Creational.Factory;

public class QNBBank implements IBank{


    @Override
    public String withdraw() {
        return "Your request has been handled by QNB Bank";
    }
}
