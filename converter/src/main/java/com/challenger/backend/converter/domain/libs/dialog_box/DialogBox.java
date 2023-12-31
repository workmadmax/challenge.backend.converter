package com.challenger.backend.converter.domain.libs.dialog_box;

import javax.swing.JOptionPane;

import com.challenger.backend.converter.domain.currency_convert.ToConvert;
import com.challenger.backend.converter.domain.temperature_convert.Conversion;

public class DialogBox {

	private ToConvert coins = new ToConvert();
	private Conversion temperature = new Conversion();

	

	public DialogBox() {
		super();
	}

	public DialogBox(ToConvert coins) {
        this.coins = coins;
    }

    public ToConvert getCoins() {
		return coins;
	}

	public void setCoins(ToConvert coins) {
		this.coins = coins;
	}

	public void execute() {

		String options = "";

		while (true) {

			try {
				options = JOptionPane.showInputDialog(null, "Choose an option", "Menu",
					JOptionPane.PLAIN_MESSAGE, null, new Object[] {
							"Convert currency",
							"temperature"
					}, "Choice").toString();
			} catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Thanks for using our converter finish");
				System.exit(0);
			}

			switch (options) {
				case "Convert currency":
					String inputValue = JOptionPane.showInputDialog("Enter the value to convert");
					if (inputValidator(inputValue)) {
						double value = Double.parseDouble(inputValue);
						coins.currencyConvert(value);
						int continueConvert = JOptionPane.showConfirmDialog(null, "Do you want to continue converting?",
								"Continue", JOptionPane.YES_NO_CANCEL_OPTION);
						if (continueConvert == JOptionPane.NO_OPTION) {
							JOptionPane.showMessageDialog(null, "Thanks for using our converter finish");
							System.exit(0);
						}
						if (continueConvert == JOptionPane.CANCEL_OPTION) {
							JOptionPane.showMessageDialog(null, "Thanks for using our converter compleate");
							System.exit(0);
						}
					}
					break;
				case "temperature":
					inputValue = JOptionPane.showInputDialog("Enter the value to convert");
					if (inputValidator(inputValue)) {
						double value = Double.parseDouble(inputValue);
						temperature.temperatureConvert(value);
						int continueConvert = JOptionPane.showConfirmDialog(null, "Do you want to continue converting?",
								"Continue", JOptionPane.YES_NO_CANCEL_OPTION);
						if (continueConvert == JOptionPane.NO_OPTION) {
							JOptionPane.showMessageDialog(null, "Thanks for using our converter finish");
							System.exit(0);
						}
						if (continueConvert == JOptionPane.CANCEL_OPTION) {
							JOptionPane.showMessageDialog(null, "Thanks for using our converter compleate");
							System.exit(0);
						}
					}
			}
		}
	}

	private boolean rangeNumberValidator(double value) {
		double INT_MAX_VALUE = 2147483647;
		double INT_MIN_VALUE = -2147483648;
		if (value > INT_MAX_VALUE || value < INT_MIN_VALUE) {
			JOptionPane.showMessageDialog(null, "Invalid value");
			return false;
		}
		return true;
	}

	private boolean inputValidator(String inputValue) {
		try {
			rangeNumberValidator(Double.parseDouble(inputValue));
			return true;
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Invalid value");
			return false;
		}
	}}
