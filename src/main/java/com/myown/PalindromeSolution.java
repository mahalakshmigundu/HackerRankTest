package com.myown;

import java.io.*;
import java.util.*;

public class PalindromeSolution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        String temp ="";
        for(int i= A.length()-1; i >=0 ; i--){
            temp += A.charAt(i);
        }

        if(A.equals(temp)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        /* Enter your code here. Print output to STDOUT. */

    }
}




