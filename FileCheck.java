package com.java.assignments.assignment1;

import java.io.File;
import java.util.regex.*;
import java.util.Scanner;

public class FileCheck {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        File file=new File("/home/mohanK/TestRegex");
        String[] fileList= file.list();
        //System.out.println("Enter the pattern of the file(s) to search: ");
        //String patternSearch=sc.next();
        //Pattern p = Pattern.compile(patternSeach);
        Pattern p = Pattern.compile("[f]+");

        for(String eachFile:fileList){
            Matcher m = p.matcher(eachFile);
            if(m.find()){
                //System.out.println(eachFile);
                System.out.println(file.getPath()+"/"+eachFile);
            }
        }
    }
}
