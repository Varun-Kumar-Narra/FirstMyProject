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



class Result14 {

    /*
     * Complete the 'findNextGreaterElementsWithDistance' function below.
     *
     * The function is expected to return a 2D_INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY readings as parameter.
     */

    public static List<List<Integer>> findNextGreaterElementsWithDistance(List<Integer> readings) {
    // Write your code here
    List<List<Integer>> ld = new ArrayList<List<Integer>>();
    for(int i=0;i<readings.size();i++)
    {
        int ele = readings.get(i),hele=-1, diff=-1;
        for(int j=i+1;j<readings.size();j++)
        {
            if(readings.get(j)>ele)
            {
                diff = j-i;
                hele = readings.get(j);
                break;
            }
        }
        ld.add(List.of(hele,diff));
    }
    return ld;
    }
    

}

public class Solution16 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int readingsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> readings = IntStream.range(0, readingsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<List<Integer>> result = Result14.findNextGreaterElementsWithDistance(readings);

        result.stream()
            .map(
                r -> r.stream()
                    .map(Object::toString)
                    .collect(joining(" "))
            )
            .collect(toList())
            .forEach(System.out::println);

        bufferedReader.close();
    }
}

