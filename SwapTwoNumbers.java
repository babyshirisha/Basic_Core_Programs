package com.bz.basiccoreprograms;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1,num2;
        num1= scan.nextInt();
        num2=scan.nextInt();
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("the swap numbers  "+ num1+" "+ num2);
    }
}
