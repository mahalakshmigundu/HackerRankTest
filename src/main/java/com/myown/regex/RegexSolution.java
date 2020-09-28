package com.myown.regex;

import java.io.*;
import java.util.*;

public class RegexSolution {

    public static final String S = "[!,?._'@\\s]+";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if(!s.trim().equals("")){
            String[] splits = s.trim().split(S);
            System.out.println(splits.length);
            System.out.println( s.trim().replaceAll(S, "\n"));
        }else{
            System.out.println("0");
        }

        scan.close();
    }
}


