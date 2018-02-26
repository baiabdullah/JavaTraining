package com.bai.java;
//Program 2: Program to display all the contents of a directory

// Here we will accept a directory name from the keyboard and then display all the contents of the directory .For this purpose, list() method can be used as:

// String arr[]=f.list();
// In the preceding statement , the list() method causes all the directory entries copied into the array arr[]. Then pass these array elements arr[i] to File object // and test them to know if they represent a file or directory .

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
 
//Displaying the contents of a directory
class FileContentReading
{
    public static void main(String[] args) throws IOException {
        //enter the path and dirname from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        System.out.println("Enter dirpath:");
        String dirpath=br.readLine();
        System.out.println("Enter the dirname");
        String dname=br.readLine();
 
        //create File object with dirpath and dname
        File f = new File(dirpath, dname);
 
        //if directory exists,then
        if(f.exists())
        {
            //get the contents into arr[]
            //now arr[i] represent either a File or Directory
            String arr[]=f.list();
 
            //find no. of entries in the directory
            int n=arr.length;
 
            //displaying the entries
            for (int i = 0; i < n ; i++) {
                System.out.println(arr[i]);
                //create File object with the entry and test
                //if it is a file or directory
                File f1=new File(arr[i]);
                if(f1.isFile())
                    System.out.println(": is a file");
                if(f1.isDirectory())
                    System.out.println(": is a directory");
            }
            System.out.println("No of entries in this directory "+n);
        }
        else
            System.out.println("Directory not found");
    }
}