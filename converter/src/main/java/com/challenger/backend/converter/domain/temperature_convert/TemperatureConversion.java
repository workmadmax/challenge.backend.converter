package com.challenger.backend.converter.domain.temperature_convert;

import javax.swing.JOptionPane;

public class TemperatureConversion {

    public double convertCelsiusToFahrenheit(double celsius) {
        double celsiusToConvert = (celsius * 9/5) + 32;
        celsiusToConvert = Math.round(celsiusToConvert * 100.0) / 100.0;
        JOptionPane.showMessageDialog(null, "The value in Fahrenheit is: °F " + celsiusToConvert);
        return (celsiusToConvert);
    }

    public double convertCelsiusToKelvin(double celsius) {
        double celsiusToConvert = celsius + 273.15;
        celsiusToConvert = Math.round(celsiusToConvert * 100.0) / 100.0;
        JOptionPane.showMessageDialog(null, "The value in Kelvin is: °K " + celsiusToConvert);
        return (celsiusToConvert);
    }

    public double convertFahrenheitForCelsius(double fahrenheit) {
        double fahrenheitToConvert = (fahrenheit - 32) * 5/9;
        fahrenheitToConvert = Math.round(fahrenheitToConvert * 100.0) / 100.0;
        JOptionPane.showMessageDialog(null, "The value in Celsius is: °C " + fahrenheitToConvert);
        return (fahrenheitToConvert);
    }

    public double convertKelvinForCelsius(double kelvin) {
        double kelvinToConvert = kelvin - 273.15;
        kelvinToConvert = Math.round(kelvinToConvert * 100.0) / 100.0;
        JOptionPane.showMessageDialog(null, "The value in Celsius is: °C " + kelvinToConvert);
        return (kelvinToConvert);
    }

    public double convertFahrenheitToKelvin(double fahrenheit) {
        double fahrenheitToConvert = (fahrenheit - 32) * 5/9 + 273.15;
        fahrenheitToConvert = Math.round(fahrenheitToConvert * 100.0) / 100.0;
        JOptionPane.showMessageDialog(null, "The value in Kelvin is: °K " + fahrenheitToConvert);
        return (fahrenheitToConvert);
    }

    public double convertKelvinForFahrenheit(double kelvin) {
        double kelvinToConvert = (kelvin - 273.15) * 9/5 + 32;
        kelvinToConvert = Math.round(kelvinToConvert * 100.0) / 100.0;
        JOptionPane.showMessageDialog(null, "The value in Fahrenheit is: °F " + kelvinToConvert);
        return (kelvinToConvert);
    }
}
