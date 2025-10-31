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



class Result8 {

    /*
     * Complete the 'processCouponStackOperations' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY operations as parameter.
     */
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    void push(int x)
    {
        mainStack.push(x);
        if(minStack.isEmpty() || x<=minStack.peek())
            minStack.push(x);
    }
    int getMin()
    {
        return minStack.peek();
    }
    int top()
    {
        return mainStack.peek();
    }
    void pop()
    {
        if(mainStack.peek().equals(minStack.peek()))
            minStack.pop();
        mainStack.pop();   
    }
    public static List<Integer> processCouponStackOperations(List<String> operations) {
    // Write your code here
    List<Integer> out = new ArrayList<Integer>();
    Result8 r = new Result8();
    for(int i=0;i<operations.size();i++)
    {
        String[] inp = operations.get(i).split(" ");
        String op = inp[0];
        int ele;
        if(inp.length>1)
        {
            ele = Integer.parseInt(inp[1]);
            r.push(ele);
        }
        else{
            if(op.equals("pop"))
                r.pop();
            if(op.equals("top"))
                out.add(r.top());
            if(op.equals("getMin"))
                out.add(r.getMin());
        }       
    }
    List<Integer> ol = out;
    return ol;

    }

}

public class Solution10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int operationsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> operations = IntStream.range(0, operationsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> result = Result8.processCouponStackOperations(operations);

        System.out.println(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
        );

        bufferedReader.close();
    }
}

