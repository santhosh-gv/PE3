package com.stackroute.pe3;

import java.util.Scanner;

public class StudentMarks {
    private int numOfStudents;
    private int[] stuGrades;

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public void setStuGrades() {
        this.stuGrades = new int[numOfStudents];
        Scanner obj = new Scanner(System.in);
        for(int i=0;i<numOfStudents;i++)
        {
            System.out.println("Enter the marks of student "+ (i+1));
            try {
                int temp = obj.nextInt();
                if(temp>=0 && temp<=100)
                {
                    this.stuGrades[i] = temp;
                }
                else
                    throw new Exception("not in range");
            }
            catch (Exception e)
            {
                System.out.println("Invalid Grade");
                return;
            }
        }

    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        StudentMarks studs = new StudentMarks();
        System.out.println("Enter the number of Students");
        studs.setNumOfStudents(obj.nextInt());
        studs.setStuGrades();
    }
}
