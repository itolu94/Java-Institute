package main.java.Chapter13.IO.Try.with.Resources.and.Other.Topics;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;

public class IO {
    public static void main(String args[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in ));
        try{
            System.out.println("Input a character");
            // reads input and returns char int value
            int c = br.read();
            System.out.println("Character value is " + c);
            System.out.println();
            System.out.println("Write a funny joke");
            String s = br2.readLine();
            // System.out should be used for debugging and small personal projects....
            System.out.println("Your joke: " + s + " was really funny!!");

            //To write to the console, use PrintWriter stream
            PrintWriter prwr= new PrintWriter(System.out, true);
            prwr.println("Output to the console using PrintWriter!!!!");

        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }


}
