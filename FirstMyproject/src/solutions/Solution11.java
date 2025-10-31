package solutions;

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



class Result9 {

    /*
     * Complete the 'countAffordablePairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY prices
     *  2. INTEGER budget
     */

    public static int countAffordablePairs(List<Integer> prices, int budget) {
    // Write your code here
    int count=0;
    for(int i=0;i<prices.size();i++)
    {
        for(int j=i+1;j<prices.size();j++)
        {
            int sum = prices.get(i)+prices.get(j);
            if(sum<=budget)
                count++;
        }
    }
    return count;
    }

}

public class Solution11 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int pricesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> prices = IntStream.range(0, pricesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int budget = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result9.countAffordablePairs(prices, budget);

        System.out.println(result);

        bufferedReader.close();
    }
}

