package com.stackroute.pe3;

import java.util.Scanner;

public class ConsecutiveNumbers {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String numberStr = obj.next();
        String[] numbers = numberStr.split(",");
        int[] nos = new int[numbers.length];

        for (int i =0;i<numbers.length;i++)
        {
            nos[i] = Integer.parseInt(numbers[i]);
        }
        System.out.print(numberStr);

        for (int i = 0;i<numbers.length-1;i++)
        {
            if(nos[i+1]-nos[i]!=1)
            {

                System.out.print(" are non consecutive numbers");
                return;
            }
        }
        System.out.print(" are consecutive numbers");

    }
}