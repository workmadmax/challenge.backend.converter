package com.challenger.backend.converter;

import com.challenger.backend.converter.domain.libs.dialog_box.DialogBox;

/**
 * Uma caixa de dialogo que converte um valor em real para dolar, euro e libra.
 * Ou pode converter temperatura de celsius para fahrenheit e vice-versa.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DialogBox   dialogBox = new DialogBox();
        dialogBox.execute();
    }
}
