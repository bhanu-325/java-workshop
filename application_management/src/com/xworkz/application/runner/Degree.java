package com.xworkz.application.runner;

public class Degree {
    public static void main(String[] args) {
        String degreeName[] = {"BCA","BE","Btech","MCA","MSC"};
        System.out.println("accessing array elements using index number");
        System.out.println(degreeName[0]);
        System.out.println("length of array elements:"+degreeName.length);
        for(int i = degreeName.length-1; i>=0; i--){
            System.out.println(degreeName[i]);
        }
    }
}
