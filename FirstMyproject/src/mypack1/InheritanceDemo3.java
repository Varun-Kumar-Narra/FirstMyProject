//Polymorphism - Method overloading and Method overriding
package mypack1;
class Base1
{
	int i;
	int j;
	Base1(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	
	void display()
	{
		System.out.println("i="+i+" "+"j="+j);
	}
}
class Derived1 extends Base1
{
	int k;
	Derived1(int i, int j,int k)
	{
		super(i,j);
		this.k= k;
	}
	void display()//overridden method
	{
		super.display();//invokes Base class display()
		System.out.println("k="+k);
	}
}
public class InheritanceDemo3 {
	public static void main(String[] args) {
		Base1 b = new Base1(10,20);//b=i=0, b.j=0
		b.display();//i=10 j=20
		Derived1 d = new Derived1(11,12,30);//d.i=0, d.j=0, d.k=0
		d.display();//i=30 j=40 k=50
	}

}
