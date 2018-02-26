package com.bai.java;
import java.io.*;
public class CopyFile1 {

   public static void main(String args[]) throws IOException {
      FileReader in = null;
      FileWriter out = null;

      try {
         in = new FileReader("input.txt");  //FileReader, build in method in the java.io
         out = new FileWriter("output.txt"); //FileWriter, build in method in java.io
         
         int c;//Read the filename character by character then store it in ASCII. Thats why it is in int.
         while ((c = in.read()) != -1) { //-1 mean END OF FILE. There is nothing left in the file.
            out.write(c);
         }
      }finally {
         if (in != null) { //if in is still open
            in.close(); //better close it
         }
         if (out != null) { //if out is still open
            out.close(); //better close it
         }
      }
   }
}