package com.stackroute.pe3;

public class ChessBoard {
    public static void main(String[] args) {
        String black = "BB";
        String white = "WW";

        for (int i=0;i<8;i++)
        {
            for (int j=0;j<8;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print(white+"|");
                }
                else
                {
                    System.out.print(black+"|");
                }
            }
            System.out.println("");
        }

    }
}
