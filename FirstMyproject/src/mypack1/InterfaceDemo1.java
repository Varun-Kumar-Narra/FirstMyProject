package mypack1;


interface School
{
	void details();
}
interface Class
{
	void grade();
}
class Varun implements School, Class{

	@Override
	public void grade() {
		System.out.println("10th Standard");
		
	}

	@Override
	public void details() {
		System.out.println("Jyothirmayee E.M School");
		
	}
	
}
public class InterfaceDemo1 {

	public static void main(String[] args) {
		Varun v = new Varun();
		v.details();
		v.grade();

	}

}
