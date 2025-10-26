import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        inp.nextLine();
        LinkedHashMap<Integer, ArrayList<String>> lhm = new LinkedHashMap<Integer, ArrayList<String>>();
        ArrayList<ArrayList<String>> aList = new ArrayList<ArrayList<String>>();

        for(int i=1;i<=n;i++)
        {
            String s= inp.nextLine();
            String[] sin = s.split(" ");
            List<String> al = Arrays.asList(sin);
            ArrayList<String> arrayList = new ArrayList<>(al);
            /*LinkedHashMap<Integer, ArrayList<String>> lhm = new LinkedHashMap<Integer, ArrayList<String>>();
            lhm.put(new Integer(arrayList.get(0)),arrayList);*
            System.out.println(lhm);*/
            aList.add(arrayList);
            /*for(String sd:arrayList){
                    System.out.print(sd+" ");
            }
            System.out.println();*/
        }
        //System.out.println(aList.get(0).get(3));

        int m = inp.nextInt();
        inp.nextLine();
        for(int i=0;i<m;i++)
        {
            String s= inp.nextLine();
            String[] sin = s.split(" ");
            int oa = Integer.parseInt(sin[0]);
            int ina = Integer.parseInt(sin[1]);
            /*for(String sd:sin){
                    System.out.print(sd+" ");
            }*/
            if(ina>=aList.get(oa-1).size()){
                System.out.println("ERROR!");
            }
            else{
            	//System.out.println(oa+" "+ina+" "+aList.get(oa-1).size());
                System.out.println(aList.get(oa-1).get(ina));
            }
        }
    }
}