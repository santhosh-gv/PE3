package com.stackroute.pe3;

import java.util.Scanner;

public class GenerateExceptions {
    public static void main(String[] args) {
            try {
                System.out.println("Enter the size of the array");
                Scanner obj = new Scanner(System.in);
                int size = obj.nextInt();
                int[] array = new int[size];
                String ar = null;
                System.out.println(ar.charAt(4));
                System.out.println(array[size+2]);
            }
            catch (NegativeArraySizeException n)
            {
                System.out.println("You've entered a negative value");
            }
            catch (IndexOutOfBoundsException i)
            {
                System.out.println("Accessing a value beyond existence");
            }
            catch (NullPointerException p)
            {
                System.out.println("No value exists");
            }
    }



}
