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



class Result11 {

    /*
     * Complete the 'findTaskPairForSlot' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY taskDurations
     *  2. INTEGER slotLength
     */

    public static List<Integer> findTaskPairForSlot(List<Integer> taskDurations, int slotLength) {
    // Write your code here
    /*List<Integer> indices = new ArrayList<Integer>();
    int sum=0;
    for(int i=0;i<taskDurations.size();i++)
    {
        for(int j=i+1;j<taskDurations.size();j++)
        {
            sum=taskDurations.get(i)+taskDurations.get(j);
            if(sum==slotLength)
            {
                indices.add(i);
                indices.add(j);
                return indices;
            }
        }
    }
    return List.of(-1,-1);*/
    Map<Integer, Integer> map = new HashMap<>();
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < taskDurations.size(); i++) {
        int complement = slotLength - taskDurations.get(i);
        if (map.containsKey(complement)) {
            result.add(map.get(complement));
            result.add(i);
            return result;
        }
        map.put(taskDurations.get(i), i);
    }

    result.add(-1);
    result.add(-1);
    return result;
    }

}

public class Solution13 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int taskDurationsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> taskDurations = IntStream.range(0, taskDurationsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int slotLength = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> result = Result11.findTaskPairForSlot(taskDurations, slotLength);

        System.out.println(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
        );

        bufferedReader.close();
    }
}

