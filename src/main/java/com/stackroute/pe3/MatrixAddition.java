package com.stackroute.pe3;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int r,c;
        System.out.println("Enter the number of rows");
        r=obj.nextInt();
        System.out.println("Enter the number of columns");
        c=obj.nextInt();

        int[][] array1 = new int[r][c];
        int[][] array2 = new int[r][c];

        System.out.println("Enter the elements of the 1st Array");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                array1[i][j] = obj.nextInt();
            }
        }

        System.out.println("Enter the elements of the 2nd Array");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                array2[i][j] = obj.nextInt();
            }
        }

        System.out.println("The sum of the arrays is");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(array1[i][j]+array2[i][j]+" ");
            }
            System.out.println("");
        }


    }
}
