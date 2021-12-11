package com.codewithpranay;

import java.text.NumberFormat;
import java.util.Scanner;
import java.lang.Math;

public class MortgageCalculator {
    public static void main(String[] args){

        final byte monthsInYear = 12;
        final byte percent = 100;

        Scanner scan = new Scanner(System.in);

        System.out.print("Principal : ");
        int Principal = scan.nextInt();

        System.out.print("Annual Intrest Rate : ");
        float AnnualIntrestRate = scan.nextFloat();

        float MonthlyIntrestRate = AnnualIntrestRate/percent/monthsInYear;

        System.out.print("Period (Years) : ");
        byte period = scan.nextByte();

        int numberOfMonthsInYear= monthsInYear*period;

        double mortgage = (Principal*((MonthlyIntrestRate*Math.pow(1+MonthlyIntrestRate,numberOfMonthsInYear)) /
                (Math.pow(1+MonthlyIntrestRate,numberOfMonthsInYear)-1)));

        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.print("Mortgage : " +mortgageFormat);
    }
}
