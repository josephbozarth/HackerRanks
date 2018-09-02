import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.lang.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the dynamicArray function below.
     */
    static int[] dynamicArray(int n, int[][] queries) {
        ArrayList<ArrayList<Integer>> returnArr = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> returnArr2 = new ArrayList<>();
        int lastAns = 0;
        for(int i = 0; i < n; i++){
            returnArr.add(new ArrayList<Integer>());
        }
        for(int i = 0; i < queries.length; i++){
            if(queries[i][0] == 1){
                int seq = ((queries[i][1] ^ lastAns) % n);
                returnArr.get(seq).add(queries[i][2]);
            }
            else{
                int seq = ((queries[i][1] ^ lastAns) % n);
                lastAns = returnArr.get(seq).get(queries[i][2] % returnArr.get(seq).size());
                returnArr2.add(lastAns);
                
            }
        }
        int[] a = new int[returnArr2.size()];
        for (int i = 0; i < a.length; i++){
            a[i] = returnArr2.get(i).intValue();
        }
        return a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nq[0].trim());

        int q = Integer.parseInt(nq[1].trim());

        int[][] queries = new int[q][3];

        for (int queriesRowItr = 0; queriesRowItr < q; queriesRowItr++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int queriesColumnItr = 0; queriesColumnItr < 3; queriesColumnItr++) {
                int queriesItem = Integer.parseInt(queriesRowItems[queriesColumnItr].trim());
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }

        int[] result = dynamicArray(n, queries);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
