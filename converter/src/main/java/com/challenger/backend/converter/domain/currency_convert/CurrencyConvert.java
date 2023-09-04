package com.challenger.backend.converter.domain.currency_convert;

import javax.swing.JOptionPane;

public class CurrencyConvert {

    public void convertRealToDollar(double value) {
        double dollarCoin = value / 5.5;
        dollarCoin = (double) Math.round(dollarCoin * 100) / 100;
        JOptionPane.showMessageDialog(null, "The value in dollar is: " + dollarCoin);
        System.out.println("Convert Real to Dollar");
    }

    public void covertRealToEuro(double value) {
        double euroCoin = value / 6.5;
        euroCoin = (double) Math.round(euroCoin * 100) / 100;
        JOptionPane.showMessageDialog(null, "The value in euro is: " + euroCoin);
        System.out.println("Convert Real to Euro");
    }

    public void convertRealToLibras(double value) {
        double librasCoin = value / 7.5;
        librasCoin = (double) Math.round(librasCoin * 100) / 100;
        JOptionPane.showMessageDialog(null, "The value in libras is: " + librasCoin);
        System.out.println("Convert Real to Libras");
    }

    public void convertRealToBitcoin(double value) {
        double bitcoinCoin = value / 250000;
        bitcoinCoin = (double) Math.round(bitcoinCoin * 100) / 100;
        JOptionPane.showMessageDialog(null, "The value in bitcoin is: " + bitcoinCoin);
        System.out.println("Convert Real to Bitcoin");
    }

    public void convertRealToPesosChilenos(double value) {
        double pesosChilenosCoin = value / 0.0072;
        pesosChilenosCoin = (double) Math.round(pesosChilenosCoin * 100) / 100;
        JOptionPane.showMessageDialog(null, "The value in pesos chilenos is: " + pesosChilenosCoin);
        System.out.println("Convert Real to Pesos Chilenos");
    }

}
