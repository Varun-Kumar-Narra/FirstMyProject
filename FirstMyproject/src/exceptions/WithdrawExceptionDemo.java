package exceptions;
class WithdrawException extends Exception
{
	WithdrawException(String msg)
	{
		super(msg);
	}
	WithdrawException(){}
}
class Client
{
	void setTotalAmount(int amount, int balance) throws WithdrawException
	{
		if (amount>balance)
			throw new WithdrawException("Insufficient Balance");
			System.out.println("Your Total Amount : "+(amount+balance));
	}
}
public class WithdrawExceptionDemo {
	public static void main(String[] args) {
		Client c = new Client();
		try {
			c.setTotalAmount(200,500);
		} catch (WithdrawException e) {
			//System.err.println(e);//invokes toString() implicitly
			System.err.println(e.getMessage());
			//e.printStackTrace();
		}

	}

}
