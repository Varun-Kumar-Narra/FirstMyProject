import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = "Hello";
		String s2 = "World";
		char[] c= s2.toCharArray();
		StringBuffer sb = new StringBuffer(s1);
		System.out.println(s1+" "+s2);
		System.out.println("Character Array:"+c);
		System.out.println("s1+s2 = "+s1+s2);
		System.out.println(" Compare "+s1.compareTo(s2));
		System.out.println(" Start Index: "+s1.startsWith("H"));
		System.out.println(" End Index: "+s1.endsWith("D"));
		System.out.println(" Index: "+s1.indexOf("l"));
		System.out.println("String Reverse: "+sb.reverse());
		int n=148;
		String nv= String.valueOf(n);
		System.out.println(" int to String conversion: "+nv+" varun");
        String data = in.nextLine();
        String Int = in.nextLine();
        String[] values = data.split(" ");
        String[] intValues = Int.split(" ");
        Integer[] ivalue = new Integer[intValues.length];
        for(int i=0; i<values.length; i++)
        {
        	System.out.println(values[i]);
        }
        for(int i=0;i<intValues.length; i++)
        {
        	ivalue[i] = new Integer(intValues[i]);
        }
        for(int i=0;i<intValues.length; i++)
        {
        	System.out.println(ivalue[i]);
        }
        
	}

}
