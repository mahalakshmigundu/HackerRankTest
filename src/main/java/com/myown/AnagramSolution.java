package com.myown;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramSolution {

    static boolean isAnagram(String a, String b) {
        if( a == null || b == null || a.equals("") || b.equals("") )
            throw new IllegalArgumentException();

        if ( a.length() != b.length() )
            return false;

        a= a.toLowerCase();
        b= b.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<b.length(); i++){
            char ch = b.charAt(i);

            if( ! map.containsKey(ch)){
                map.put( ch, 1 );
            } else {
                Integer count = map.get( ch );
                map.put( ch, ++count );
            }
        }

        for(int i = 0; i<a.length(); i++){
            char ch = a.charAt(i);

            if( ! map.containsKey(ch)){
               return false;
            } else {
                Integer count = map.get( ch );
                map.put( ch, --count );
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
