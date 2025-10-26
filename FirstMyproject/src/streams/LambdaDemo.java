package streams;
@FunctionalInterface
interface Phone
{
	void call(int no);
}
/*
class ApplePhone implements Phone
{
	@Override
	public void call() {
		System.out.println("Calling");
	}
}*/
public class LambdaDemo {
	public static void main(String[] args) {
		/*Phone p = new ApplePhone();
		p.call();*/
		//Anonymous inner class
		/*Phone p = new Phone() {
			public void call()
			{
				System.out.println("Calling");
			}
		};
		p.call();*/
		//Using Lambda Expression
		/*Phone p = () -> {System.out.println("Calling");};
		p.call();*/
		/*Phone p = () -> System.out.println("Calling");
		p.call();*/
		/*Phone p = (int no) -> System.out.println("Calling : "+no);
		p.call(8888);*/
		/*Phone p = (no) -> System.out.println("Calling : "+no);
		p.call(8888);*/
		Phone p = no -> System.out.println("Calling : "+no);
		p.call(8888);
	}

}
