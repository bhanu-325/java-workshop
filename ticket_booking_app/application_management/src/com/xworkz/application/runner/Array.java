package com.xworkz.application.runner;

public class Array {
    public static void main(String[] args) {
        int number[]={45,67,78,93};
        System.out.println("length of array number:"+number.length);
        System.out.println("reverse of numbers");
        for(int i = number.length-1;i>=0;i--)
        {
            System.out.println(number[i]);
        }
    }
}
