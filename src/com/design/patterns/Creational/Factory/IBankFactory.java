package com.design.patterns.creational.factory;

import java.util.Optional;

public interface IBankFactory {

    Optional<IBank> getBank(String bankCode);
}
