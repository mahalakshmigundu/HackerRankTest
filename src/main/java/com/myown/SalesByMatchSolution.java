package com.myown;

import java.io.IOException;
import java.util.Scanner;

public class SalesByMatchSolution {
    private static final Scanner scanner = new Scanner(System.in);

    /**
    Example inputs are
     9
     10 20 20 10 10 30 50 10 20

     10
     1 1 3 1 2 1 3 3 3 3
     */
    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int count = 0;
        int loop;
        for (int i = 0; i<ar.length ; ) {
            loop = ar.length;
            for(int j=i+1; j<ar.length;j++){
                if(ar[i] == ar[j]){
                    count++;
                    ar = removeIndexValue(ar, i, j);
                    break;
                }
            }
            if(loop == ar.length){
                i++;
            }
        }
        return count;
    }

    //Remove matching two elements from the array by using temp array
    private static int[] removeIndexValue(int[] array, int rm_index1, int rm_index2){
        // Create a proxy array of size one less than original array
        int[] tempArray = new int[array.length - 2];
        for (int i = 0, k = 0; i<array.length; i++) {
            // check if index is crossed, continue without copying
            if (i == rm_index1 || i == rm_index2 ) {
                continue;
            }

            // else copy the element
            tempArray[k++] = array[i];
        }
        return tempArray;
    }
}
