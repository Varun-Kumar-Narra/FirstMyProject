package streams;

@FunctionalInterface
interface arithmetic{
	int result(int a, int b);
}

public class LambdaDemo1 {
	public static void main(String[] args) {
		arithmetic add = (a,b) -> a+b;
		arithmetic sub = (a,b) -> a-b;
		arithmetic mul = (a,b) -> a*b;
		printResult(3, 4, add);
		printResult(7, 5, sub);
		printResult(5, 2, mul);
		
	}
	public static void printResult(int a, int b, arithmetic func) {
		int result = func.result(a, b);
		System.out.println(result);
		
	}

}
