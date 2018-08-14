package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
	// write your code here
       try {
           FileInputStream fis=new FileInputStream("lx.txt");
       }catch (FileNotFoundException e){

       }
    }
}
