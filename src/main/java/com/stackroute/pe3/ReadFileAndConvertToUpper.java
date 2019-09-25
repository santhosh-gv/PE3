package com.stackroute.pe3;

import java.io.*;

public class ReadFileAndConvertToUpper {
    public static void main(String[] args) {
        int blank=0;
        try
        {
            File f=new File("/home/cgi/Desktop/PE3/src/main/java/com/stackroute/pe3/FileDemo.txt");
            FileReader fr=new FileReader(f);
            BufferedReader br=new BufferedReader(fr);
            int c = 0;
            while((c = br.read()) != -1)
            {
                char ch = (char) c;
                if(ch==' ')
                {
                    blank++;
                }
                ch =Character.toUpperCase(ch);
                System.out.print(ch);
            }
            System.out.println();
            System.out.println("The number of words in this file is "+(blank+1));
        }
        catch (FileNotFoundException r)
        {
            System.out.println("The specified file is not found");
        }
        catch (IOException e)
        {
            System.out.println("IO Exception");
        }
    }
}
