package com.design.patterns.Creational.Factory;

import com.design.patterns.exceptions.InvalidCardException;
import java.util.Scanner;

public class FactoryClient {

    public static void main(String[] args) throws InvalidCardException {
        BankFactory bankFactory=new BankFactory();
        Scanner scanner=new Scanner(System.in);
        String cardNumber=scanner.nextLine();
        IBank bank=bankFactory.getBank(cardNumber.substring(0,6)).orElseThrow(()->new InvalidCardException("Invalid card number"));
        System.out.println(bank.withdraw());
    }
}
