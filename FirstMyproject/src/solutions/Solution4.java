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



class Result2 {

    /*
     * Complete the 'isNonTrivialRotation' function below.
     *
     * The function is expected to return a BOOLEAN.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static boolean isNonTrivialRotation(String s1, String s2) {
    // Write your code here
    if(s1.equals(s2) || s1.length()==0 || s2.length()==0)
        return false;
    else
    {
        String s3 = s1+s1;
        if(s3.contains(s2))
            return true;
        else
            return false;
    /*char[] chars1 = s1.toCharArray();
    Arrays.sort(chars1);
    char[] chars2 = s2.toCharArray();
    Arrays.sort(chars2);
    String SS1 = String.valueOf(chars1);
    String SS2 = String.valueOf(chars2);
    //System.out.println(SS1);
    //System.out.println(SS2);
    if(SS1.equals(SS2))
        return true;
    else
        return false;*/
    }
    }

}

public class Solution4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = bufferedReader.readLine();

        String s2 = bufferedReader.readLine();

        boolean result = Result2.isNonTrivialRotation(s1, s2);

        System.out.println(result ? 1 : 0);

        bufferedReader.close();
    }
}
