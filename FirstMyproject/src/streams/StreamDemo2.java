package streams;
import java.util.*;
import java.util.stream.*;
class Product
{
	int pid;
	String pname;
	int price;
	public Product(int pid, String pname, int price) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	public Product() {}
	public String toString()
	{
		return pid+" "+pname+" "+price;
	}
}
public class StreamDemo2 {
	public static void main(String[] args) {
		List<Product> list1 = new ArrayList<>();
		for(Product prod : getProducts())
		{
			if (prod.price > 1000)
				list1.add(prod);
		}
		list1.forEach(System.out::println);
		//Using Stream API
		System.out.println("Using Stream API");
		List<Product> list2 = getProducts().stream().filter((prod) -> prod.price > 1000).collect(Collectors.toList());
		list2.forEach(System.out::println);
	}
	private static List<Product> getProducts()
	{
		List<Product> prodList = new ArrayList<>();
		prodList.add(new Product(101,"monitor",5000));
		prodList.add(new Product(102,"keyboard",500));
		prodList.add(new Product(103,"mouse",300));
		prodList.add(new Product(104,"ups",2000));
		prodList.add(new Product(105,"speakers",1000));
		return prodList;
	}
}
