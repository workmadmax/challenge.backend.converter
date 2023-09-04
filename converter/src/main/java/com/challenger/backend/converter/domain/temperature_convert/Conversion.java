package com.challenger.backend.converter.domain.temperature_convert;

import javax.swing.JOptionPane;

public class Conversion {
    
    TemperatureConversion temperature = new TemperatureConversion();

    public void temperatureConvert(double value) {

        String options = (JOptionPane.showInputDialog(null, "Choose temperature to convert", "Temperature",
                JOptionPane.PLAIN_MESSAGE, null, new Object[] {
                        "From Celsius to Fahrenheit",
                        "From Celsius to Kelvin",
                        "From Fahrenheit to Celsius",
                        "From Fahrenheit to Kelvin",
                        "From Kelvin to Celsius",
                        "From Kelvin to Fahrenheit"
                }, "Choice")).toString();

        switch (options) {
            case "From Celsius to Fahrenheit":
                temperature.convertCelsiusToFahrenheit(value);
                break;
            case "From Celsius to Kelvin":
                temperature.convertCelsiusToKelvin(value);
                break;
            case "From Fahrenheit to Celsius":
                temperature.convertFahrenheitForCelsius(value);
                break;
            case "From Fahrenheit to Kelvin":
                temperature.convertFahrenheitToKelvin(value);
                break;
            case "From Kelvin to Celsius":
                temperature.convertKelvinForCelsius(value);
                break;
            case "From Kelvin to Fahrenheit":
                temperature.convertKelvinForFahrenheit(value);
                break;
        }
    }
}
