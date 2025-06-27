import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    static void showValue(List<Integer> arr) {
        for (int v : arr)
            System.out.print(v + " ");
        System.out.println();
    }

    public static void insertionSort1(int n, List<Integer> arr) {
        int key = arr.get(n - 1);
        int j = n - 2;

        while (j >= 0 && arr.get(j) > key) {
            arr.set(j + 1, arr.get(j));
            showValue(arr);
            j--;
        }

        arr.set(j + 1, key);
        showValue(arr);
    }    
}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.insertionSort1(n, arr);

        bufferedReader.close();
    }
}
