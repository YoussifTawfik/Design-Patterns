package com.design.patterns.Creational.Factory;

import java.util.Optional;

public interface IBankFactory {

    Optional<IBank> getBank(String bankCode);
}
