package com.cydeo;

public class RecursiveFactorial {

    public static void main(String[] args) {

        System.out.println(factorial(4));
        System.out.println(factorial(5));
    }

    public static long factorial(long n){

        if (n<=1){
            return 1;
        }else{
            return n*factorial(n-1);
        }

    }
}
