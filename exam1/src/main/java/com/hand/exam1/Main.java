package com.hand.exam1;


public class Main {

    static boolean isPrimeNumber(int num){
        if(num == 2) return true;//2特殊处理
        if(num < 2 || num % 2 == 0) return false;
        for(int i=3; i<=Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main( String[] args )
    {
        int[] primes = new int[100];
        int cnt = 0;
        for(int i = 101; i <= 200; i++){
            if(isPrimeNumber(i)){
                primes[cnt++] = i;
            }
        }
        System.out.print("101-200间总共有"+cnt+"个素数,分别是：");
        System.out.print(primes[0]);
        for(int i = 1; i < cnt; i++){
            System.out.print(","+primes[i]);
        }
    }
}
