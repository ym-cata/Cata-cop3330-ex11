/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yesenia Cata
 */

import java.util.Scanner;

class CurrencyExchange
{
   double currency;
   double rate;
   public void read()
   {
       System.out.print("How many euros are you exchanging? "); //asks user to input the euros that are being exchanged 
       Scanner sc = new Scanner(System.in); //new scanner
       this.currency = sc.nextDouble();
       System.out.print("What is the exchange rate? "); //asks user the exchange rate 
       this.rate = sc.nextDouble();
   }
   public void print()
   {
       System.out.println(currency+" euros at an exchange rate of "+rate+" is"); //prints the euros and exchange rate
       double currencyConverted = currency*rate;
       System.out.printf("%.2f U.S dollars.",currencyConverted); //calculates the currency 
   }
}
public class Main{
   public static void main(String args[])
   {
       CurrencyExchange ca = new CurrencyExchange();
       ca.read();
       ca.print();
         
         
   }
}