package com.myown.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class MyRegexSolution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
