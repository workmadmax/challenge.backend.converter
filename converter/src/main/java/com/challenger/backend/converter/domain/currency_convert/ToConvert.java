package com.challenger.backend.converter.domain.currency_convert;

import javax.swing.JOptionPane;

public class ToConvert {

    CurrencyConvert coins = new CurrencyConvert();
    CurrencyConvertToReal real = new CurrencyConvertToReal();

    public void currencyConvert(double value) {

        String options = (JOptionPane.showInputDialog(null, "Choose currency to convert", "Coins",
                JOptionPane.PLAIN_MESSAGE, null, new Object[] {
                        "From Real to Dollars",
                        "From Real to Euro",
                        "From Real to Pound",
                        "From Real to Bitcoin",
                        "From Real to Pesos Chilenos",
                        "From Dollar to Real",
                        "From Euro to Real",
                        "From Pound to Real",
                        "From Bitcoin to Real",
                        "From Pesos Chilenos to Real"
                }, "Choice")).toString();

        switch (options) {
            case "From Real to Dollars":
                coins.convertRealToDollar(value);
                break;
            case "From Real to Euro":
                coins.covertRealToEuro(value);
                break;
            case "From Real to Pound":
                coins.convertRealToLibras(value);
                break;
            case "From Real to Bitcoin":
                coins.convertRealToBitcoin(value);
                break;
            case "From Real to Pesos Chilenos":
                coins.convertRealToPesosChilenos(value);
                break;
            case "From Dollar to Real":
                real.convertDollarToReal(value);
                break;
            case "From Euro to Real":
                real.convertEuroToReal(value);
                break;
            case "From Pound to Real":
                real.convertLibraToReal(value);
                break;
            case "From Bitcoin to Real":
                real.convertBitcoinToReal(value);
                break;
            case "From Pesos Chilenos to Real":
                real.convertPesosChilenosToReal(value);
                break;
        }
    }
}
