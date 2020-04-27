/*
 * JSR 354 JavaFX Binding Example
 */
package org.javamoney.examples.javafx;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import org.javamoney.moneta.Money;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

/**
 * @author Werner Keil
 */
public class Bill {
    
    // Define the property
    private DoubleProperty amountDue = new SimpleDoubleProperty();
    private double doubleValue = 10d;
    private CurrencyUnit currency =  Monetary.getCurrency("DKK");
    private Money newAmountDue = Money.of(doubleValue, currency);
            
    // Define a getter for the property's value
    public final double getAmountDue(){return amountDue.get();}
 
    public final Money getNewAmountDue() { return newAmountDue;}
    
    // Define a setter for the property's value
    public final void setAmountDue(double value){amountDue.set(value);}
 
     // Define a getter for the property itself
    public DoubleProperty amountDueProperty() {return amountDue;}
    
    
}
