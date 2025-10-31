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



class Result4 {

    /*
     * Complete the 'isAlphabeticPalindrome' function below.
     *
     * The function is expected to return a BOOLEAN.
     * The function accepts STRING code as parameter.
     */

    public static boolean isAlphabeticPalindrome(String code) {
    // Write your code here
        boolean palin = false;
       StringBuffer sb = new StringBuffer();
       for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if(Character.isLetter(c))
                sb.append(c);
        }
        //System.out.print(sb);
        StringBuffer sbr = new StringBuffer(sb).reverse();
        //System.out.print(sbr);
        if(sb.toString().toLowerCase().equals(sbr.toString().toLowerCase()))
        {
            palin = true;
            return palin;
        }
        return palin;
    }

}

public class Solution6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String code = bufferedReader.readLine();

        boolean result = Result4.isAlphabeticPalindrome(code);

        System.out.println(result ? 1 : 0);

        bufferedReader.close();
    }
}
