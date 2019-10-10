// Cody Gentry
// IT 2650
// Assignment 3
// Sept. 21st, 2019

import java.text.*;

public class InterestCalculator
{
    static double RATE = 0.015;
    static double PAYMENT = 50;

    public static void main(String[] args) 
    {
        double balance = 1000.00;
        double monthlyInterest; 
        int months = 0;
        
        DecimalFormat Currency = new DecimalFormat("#0.00");

        while (balance > 0.00)
            {
            monthlyInterest = balance * RATE;
            
            balance = balance + monthlyInterest - PAYMENT;
            
            months++;
            
            System.out.println(months + " Interest is $" + Currency.format(monthlyInterest) + " Remaining Balance is $" + Currency.format(balance));
            }    
    }
}