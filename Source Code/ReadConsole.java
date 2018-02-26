package com.bai.java;
import java.io.*;

public class ReadConsole {

   public static void main(String args[]) throws IOException {
      InputStreamReader cin = null; //class inputStreamReader is to read. Abstract class.

      try {
         cin = new InputStreamReader(System.in); //Read whatever written in the keyboard. This is the scanner
         System.out.println("Enter characters, 'q' to quit.");
         char c;
         do {
            c = (char) cin.read();
            System.out.print(c);
         } while(c != 'q' && c != 'Q');
      }finally {
         if (cin != null) {
            cin.close();
         }
      }
   }
}