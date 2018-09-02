import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the arrayManipulation function below.
     */
    static int arrayManipulation(int n, int[][] queries) {
        int[] arr = new int[n];
        int max = 0;
        for(int i = 0; i < n; i++)
            arr[i] = 0;
        for(int i = 0; i < queries.length; i++){
            for(int j = queries[i][0] - 1; j < queries[i][1]; j++){
                arr[j]+= queries[i][2];
                if(arr[j] > max)
                    max = arr[j];
            }
        }
            return max;
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

       int n, m, a, b, val, max = 0, indexVal = 0;
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[] arr = new int[n + 1];
        for(int i = 0; i <= n; i++){
            arr[i] = 0;
        }
        for(int i = 0; i < m; i++ ){
            a = scanner.nextInt();
            b = scanner.nextInt();
            val = scanner.nextInt();
            arr[a] += val;
            if((b + 1) <= n)
                arr[b + 1] -= val;

        }
        for(int i = 1; i <= n; i++){
            indexVal += arr[i];
            if(max < indexVal)
                max = indexVal;
        }

        bufferedWriter.write(String.valueOf(max));
        bufferedWriter.newLine();

        bufferedWriter.close(); 
    }
}
