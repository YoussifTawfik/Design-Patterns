package com.design.patterns.Creational.Factory;

import java.util.Optional;

public class BankFactory implements IBankFactory{

    @Override
    public Optional<IBank> getBank(String bankCode) {
        switch (bankCode) {
            case "123456":
                return Optional.of(new CIBBank());
            case "111111":
                return Optional.of(new NBEBank());
            case "222222":
                return Optional.of(new QNBBank());
        }
        return Optional.empty();
    }


}
