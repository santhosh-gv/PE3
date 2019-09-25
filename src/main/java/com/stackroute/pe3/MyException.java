package com.stackroute.pe3;

public class MyException {
    MyException(String s){
        System.out.println("Inside the constructor");
        System.out.println(s);
    }

    public static void main(String[] args) throws Exception {
        try {
            throw new  Exception("sadasd");
        }
        catch (Exception e)
        {
            MyException m = new MyException("Catching my exception");
        }
        finally {
            System.out.println("Finally! It Works :P");

        }
    }
}
