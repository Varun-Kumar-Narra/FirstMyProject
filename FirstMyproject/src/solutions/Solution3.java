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



class Result1 {

    /*
     * Complete the 'findSmallestMissingPositive' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY orderNumbers as parameter.
     */

    public static int findSmallestMissingPositive(List<Integer> orderNumbers) {
    // Write your code here
    /*List<Integer> oNumbers = new ArrayList<Integer>();
    for(int i : orderNumbers)
    {
    	if(i >= 0)
    		oNumbers.add(i);
    }
    Collections.sort(oNumbers,Collections.reverseOrder());
    int n = oNumbers.get(0);
    for(int i=1;i<=n;i++)
    {
    	if(!oNumbers.contains(i))
    	{
    		return i;
    	}
    	else{
            return n+1;
        }
    }
    return 0;
    }*/
    /*int small = 1;
    for(int i=0;i<orderNumbers.size();i++)
    {
        if(orderNumbers.get(i)==small)
            small++;
        else if(orderNumbers.get(i)>small)
            break;
    }
    return small;
    }*/
    HashSet<Integer> set = new HashSet<>();
    for (int x : orderNumbers) {
        if (x > 0) set.add(x);
    }

    // Check from 1 upwards
    int want = 1;
    while (true) {
        if (!set.contains(want)) return want;
        want++;
    }
    }
}

public class Solution3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int orderNumbersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> orderNumbers = IntStream.range(0, orderNumbersCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result1.findSmallestMissingPositive(orderNumbers);

        System.out.println(result);

        bufferedReader.close();
    }
}
