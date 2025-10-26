
class Emp {
	int empNum;
	String empName;
	double empSalary;

	void setEmpDetails() {
		empNum = 10;
		empName = "Ramu";
		empSalary = 6000.0;
	}
	void dispEmpDetails() {
		System.out.println("Emp Number ="+empNum);
		System.out.println("Emp Name ="+empName);
		System.out.println("Emp Salary ="+empSalary);
	}
}
public class Employee {
	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.setEmpDetails();
		e1.dispEmpDetails();
	}
}