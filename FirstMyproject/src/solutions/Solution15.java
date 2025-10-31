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



class Result13 {

    /*
     * Complete the 'minTasksToCancelForNoConflict' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING digits as parameter.
     */
     private static Map<Character, String> keyPad = new HashMap<>();

    private static void generateKeyPad(){
        keyPad.put('2', "abc");
        keyPad.put('3', "def");
        keyPad.put('4', "ghi");
        keyPad.put('5', "jkl");
        keyPad.put('6', "mno");
        keyPad.put('7', "pqrs");
        keyPad.put('8', "tuv");
        keyPad.put('9', "wxyz");
        keyPad.put('1', "1");
        keyPad.put('0', "0");
    }
    public static List<String> minTasksToCancelForNoConflict(String digits) {
    // Write your code here
    /*LinkedHashMap<Character,String> lhm = new LinkedHashMap<Character,String>();
    lhm.put('2', "abc");
    lhm.put('3', "def");
    lhm.put('4', "ghi");
    lhm.put('5', "jkl");
    lhm.put('6', "mno");
    lhm.put('7', "pqrs");
    lhm.put('8', "tuv");
    lhm.put('9', "wxyz");
    String fk="",sk="",fnk="",snk="";
    List<String> ls = Arrays.asList("hello","hackerrank");
    for(int i=0;i<digits.length();i++)
    {
        char k = digits.charAt(i);
        if(lhm.containsKey(k))
        {
            if(fk.isEmpty())
            {
                fk = String.valueOf(digits.charAt(i));
            }
            else{
                sk = String.valueOf(digits.charAt(i));
            }
        }
        if(!lhm.containsKey(k))
        {
            if(sk.isEmpty()&&fnk.isEmpty())
            {
                fnk = String.valueOf(digits.charAt(i));
            }
            else{
                snk = String.valueOf(digits.charAt(i));
            }
        }
            
    }
    String fs = lhm.get(fk.charAt(0));
    String ss = lhm.get(sk.charAt(0));
    List<String> sl = new ArrayList<String>();
    String cs="";
    for(int i=0;i<fs.length();i++)
    {
        for(int j=0;j<ss.length();j++)
        {
            if(fnk.isEmpty() && snk.isEmpty())
            {
                cs = ""+fs.charAt(i)+ss.charAt(j);
                sl.add(cs);
            }
            else if(!fnk.isEmpty() && !snk.isEmpty())
            {
                cs = ""+fs.charAt(i)+fnk+ss.charAt(j)+snk;
                sl.add(cs);
            }
            else if(!fnk.isEmpty() && snk.isEmpty())
            {
                cs = ""+fs.charAt(i)+fnk+ss.charAt(j);
                sl.add(cs);
            }
            else 
            {
                cs = ""+fs.charAt(i)+ss.charAt(j)+snk;
                sl.add(cs);
            }                      
        }
    }
    List<String> fsl = sl;
    return fsl;*/
    generateKeyPad();
        List<String> result = Arrays.stream(keyPad.get(digits.charAt(0)).split(""))
                                .collect(Collectors.toList());
        for(int i=1;i<digits.length();i++){
            List<String> b = Arrays.stream(keyPad.get(digits.charAt(i)).split(""))
                                .collect(Collectors.toList());
            result = cartesianProduct(result, b);
        }
        return result;
    }  
    public static List<String> cartesianProduct(List<String> a, List<String> b){
        List<String> stringList = new ArrayList<>();
        
        for(int i=0;i<a.size();i++){
            for(int j=0;j<b.size();j++){
                stringList.add(a.get(i) + b.get(j));
            }
        }
        return stringList;
    } 
}

public class Solution15 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String digits = bufferedReader.readLine();

        List<String> result = Result13.minTasksToCancelForNoConflict(digits);

        System.out.println(
            result.stream()
                .collect(joining("\n"))
        );

        bufferedReader.close();
    }
}

