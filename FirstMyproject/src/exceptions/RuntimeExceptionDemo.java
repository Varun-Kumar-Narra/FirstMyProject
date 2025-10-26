package exceptions;
public class RuntimeExceptionDemo {
	public static void main(String[] args) {
	try {	//ArithmeticException
		int n = 10/0;
		//ArrayIndexOutOfBoundsException
		int[] n3 = {10,20,30,40,50};
		System.out.println(n3[9]);
		//StringIndexOutOfBoundsException
		String s = "Welcome";
		System.out.println(s.charAt(10));
		//NegativeArraySizeException
		int[] n2 = new int[-5];
		//NumberFormatException
		String str = "abc";
		int n1 = Integer.parseInt(str);
		//NullPointerException
		String str1 = null;
		System.out.println(str1.equals("Apple"));
	}catch(ArrayIndexOutOfBoundsException e) {
		System.err.println("ArrayIndexOutofBoundsException has occured");
	}catch(StringIndexOutOfBoundsException e) {
		System.err.println("StringIndexOutOfBoundsException has occured");
	}catch(NegativeArraySizeException e) {
		System.err.println("NegativeArraySizeException has occured");
	}catch(NumberFormatException e) {
		System.err.println("NumberFormatException has occured");
	}catch(NullPointerException e) {
		System.err.println("NullPointerException has occured");
	}catch(ArithmeticException e){
		System.err.println("ArithmeticException has occured");
	}finally {
		System.err.println("Exception has occured");

	}

	}

}
