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



class Result7 {

    /*
     * Complete the 'areBracketsProperlyMatched' function below.
     *
     * The function is expected to return a BOOLEAN.
     * The function accepts STRING code_snippet as parameter.
     */

    public static boolean areBracketsProperlyMatched(String code_snippet) {
    // Write your code here
   // String s="";
   /*if(code_snippet.length()==0)
        return false;
    int open = 0, close=0;
    for(int i=0;i<code_snippet.length();i++)
    {
        if(code_snippet.charAt(i)=='('|| code_snippet.charAt(i)=='[' || code_snippet.charAt(i)=='{')
        {
            open = open+1;
           
        }
        else if(code_snippet.charAt(i)==')'|| code_snippet.charAt(i)==']' || code_snippet.charAt(i)=='}')
        {
            close = close+1;
           
        }
            
    }
    if(open==close)
        return true;
    else
        return false;*/
    Stack<Character> openSymbols = new Stack<>();
        boolean balanced = true;
        
        for(char c : code_snippet.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                openSymbols.push(c);
            }
            else if(c==')'||c=='}'||c==']'){
                if(openSymbols.isEmpty()){
                    balanced=false;
                    break;
                }
                char last = openSymbols.pop();
                if((c==')'&&last != '(')||(c=='}'&&last!='{')||(c==']'&&c=='[')){
                    balanced=false;
                    break;
                }
            }
        }
        if(!openSymbols.isEmpty()){
            balanced = false;
        }
        return balanced;

    }

}

public class Solution9 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String code_snippet = bufferedReader.readLine();

        boolean result = Result7.areBracketsProperlyMatched(code_snippet);

        System.out.println(result ? 1 : 0);

        bufferedReader.close();
    }
}

