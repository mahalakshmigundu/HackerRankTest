package com.myown;
import java.util.Scanner;

public class SolutionEx {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int i =1;
//        while(true){
//            System.out.println(i++ +" "+sc.nextLine() );
//        }
//    }
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int i = scan.nextInt();
//        double d = scan.nextDouble();
//        scan.nextLine();
//        String s = scan.nextLine();
//
//        // Write your code here.
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);
//
//        //System.out.println(String.format("%-15s", s1) + String.format("%03d", x));
//    }

//    public static void main(String []argh){
//        Scanner in = new Scanner(System.in);
//        int t=in.nextInt();
//        for(int i=0;i<t;i++){
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int n = in.nextInt();
//            int s = a;
//            for(int j=0; j<=n; j++){
//                s += Math.pow(2, j)*b;
//                System.out.print(s+ " ");
//            }
//            System.out.println();
//        }
//        in.close();
//    }

//    public static void main(String []argh)
//    {
//        Scanner sc = new Scanner(System.in);
//        int t=sc.nextInt();
//
//        for(int i=0;i<t;i++)
//        {
//            try
//            {
//                long x=sc.nextLong();
//                System.out.println(x+" can be fitted in:");
//                if(x>=-128 && x<=127)System.out.println("* byte");
//                if(x>=-32768 && x<=32767)System.out.println("* short");
//                if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
//                System.out.println("* long");
//            }
//            catch(Exception e)
//            {
//                System.out.println(sc.next()+" can't be fitted anywhere.");
//            }
//
//        }
//    }

    static boolean flag;
    static int B;
    static int H;
    static {
        final Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        if(B<=0 || H<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }else {
            flag = true;
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main
}
