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



class Result6 {

    /*
     * Complete the 'maximizeNonOverlappingMeetings' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY meetings as parameter.
     */

    public static int maximizeNonOverlappingMeetings(List<List<Integer>> meetings) {
    // Write your code here
            meetings.sort(Comparator.comparingInt(a -> a.get(1)));
            List<Integer> fl = meetings.stream().map(a -> a.get(0)).collect(Collectors.toList());
            List<Integer> sl = meetings.stream().map(a -> a.get(1)).collect(Collectors.toList());
            int lastEnd = sl.get(0),count=0;
            //System.out.println(lastEnd);
            for(int i=0;i<fl.size();i++)
            {
                if(i==0 && fl.get(i)<lastEnd)
                {
                    count++;
                }
                else if(fl.get(i)>=lastEnd)
                {
                    //System.out.println("hello");
                    lastEnd=sl.get(i);
                    count++;
                }
            }
            //fl.forEach(System.out::println);
            //sl.forEach(System.out::println);
            return count;
            
    }

}

public class Solution8 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int meetingsRows = Integer.parseInt(bufferedReader.readLine().trim());
        int meetingsColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> meetings = new ArrayList<>();

        IntStream.range(0, meetingsRows).forEach(i -> {
            try {
                meetings.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result6.maximizeNonOverlappingMeetings(meetings);

        System.out.println(result);

        bufferedReader.close();
    }
}

