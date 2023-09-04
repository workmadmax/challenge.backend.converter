package com.challenger.backend.converter.domain.currency_convert;

import javax.swing.JOptionPane;

public class CurrencyConvertToReal {


    public void convertDollarToReal(double value) {
        double realCoin = value * 5.5;
        realCoin = (double) Math.round(realCoin * 100) / 100;
        JOptionPane.showMessageDialog(null, "The value in real is: " + realCoin);
        System.out.println("Convert Dollar to Real");
    }

    public void convertEuroToReal(double value) {
        double realCoin = value * 6.5;
        realCoin = (double) Math.round(realCoin * 100) / 100;
        JOptionPane.showMessageDialog(null, "The value in real is: " + realCoin);
        System.out.println("Convert Euro to Real");
    }

    public void convertLibraToReal(double value) {
        double realCoin = value * 7.5;
        realCoin = (double) Math.round(realCoin * 100) / 100;
        JOptionPane.showMessageDialog(null, "The value in real is: " + realCoin);
        System.out.println("Convert Libra to Real");
    }

    public void convertBitcoinToReal(double value) {
        double realCoin = value * 250000;
        realCoin = (double) Math.round(realCoin * 100) / 100;
        JOptionPane.showMessageDialog(null, "The value in real is: " + realCoin);
        System.out.println("Convert Bitcoin to Real");
    }

    public void convertPesosChilenosToReal(double value) {
        double realCoin = value * 0.0072;
        realCoin = (double) Math.round(realCoin * 100) / 100;
        JOptionPane.showMessageDialog(null, "The value in real is: " + realCoin);
        System.out.println("Convert Pesos Chilenos to Real");
    }
}
