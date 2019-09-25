package com.stackroute.pe3;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        int n;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of places");
        n=obj.nextInt();
        obj.nextLine();
        System.out.println("Enter the places");
        String[] places = new String[n];
        for (int i=0;i <n;i++)
        {
            places[i]=obj.nextLine();
        }

        for(int i=0;i<n;i++)
        {
            System.out.print("Place Name without Vowels:"+i+" ");
            for(int j=0;j<places[i].length();j++)
            {

                if(places[i].charAt(j)=='a' | places[i].charAt(j)=='e' | places[i].charAt(j)=='i' | places[i].charAt(j)=='o' | places[i].charAt(j)=='u')
                {
                    System.out.print("");
                }
                else
                    System.out.print(places[i].charAt(j));
            }
            System.out.println();

        }
    }
}
