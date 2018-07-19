package com.hand.exam2;

import java.util.Map;
import java.util.TreeMap;

public class CalcTax {

    private final static CalcTax instance = new CalcTax();
    //private static Double[]  = new Double[100];
    private static Map taxRates;
    private CalcTax(){
        taxRates = new TreeMap<Integer,Double>();
        taxRates.put(1500,0.03);
        taxRates.put(4500,0.1);
        taxRates.put(9000,0.2);
        taxRates.put(35000,0.25);
        taxRates.put(55000,0.30);
        taxRates.put(80000,0.35);
        taxRates.put(1000000000,0.45);
    }

    public static CalcTax getInstance(){
        return instance;
    }

    public Double Calc(Double num){
        Double tax = 0.0;
        Integer left = 0;
        for(Object taxRate:taxRates.entrySet() ){
            Integer right = (Integer) ((Map.Entry) taxRate).getKey();
            Double rate = (Double) ((Map.Entry) taxRate).getValue();
            num =num - (right-left);
            tax+=(right-left)*rate;
            left = right;
            if(num <= 0) {
                tax += num*rate;
                break;
            }
        }
        return tax;
    }
}