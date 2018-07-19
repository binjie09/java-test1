package com.hand.exam2;

public class Main {

    public static void main(String[] args) {
        CalcTax calc = CalcTax.getInstance();
        System.out.println("userA tax:"+calc.Calc(5000.0));
        System.out.println("userB tax:"+calc.Calc(10000.0));
        System.out.println("userC tax:"+calc.Calc(15000.0));
        System.out.println("userD tax:"+calc.Calc(60000.0));
    }
}
