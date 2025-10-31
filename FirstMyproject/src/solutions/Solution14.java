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



class Result12 {

    /*
     * Complete the 'isAnagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     */

    public static int isAnagram(String s, String t) {
    // Write your code here
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        String as = String.valueOf(sc);
        String at = String.valueOf(tc);
        if(as.equals(at))
            return 1;
        else
            return 0;
    }

}

public class Solution14 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int result = Result12.isAnagram(s, t);

        System.out.println(result);

        bufferedReader.close();
    }
}

