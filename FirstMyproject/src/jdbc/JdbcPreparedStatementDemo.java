package jdbc;
import java.util.*;
import java.sql.*;
public class JdbcPreparedStatementDemo {
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		PreparedStatement st = null;
				
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Product Id");
		int pid = s.nextInt();
		System.out.println("Enter Product Name");
		String pname = s.next();
		System.out.println("Enter Product Price");
		float price = s.nextFloat();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcd","root","root");
			/*PreparedStatement st = con.prepareStatement("insert into product values (?,?,?)");
			st.setInt(1, pid);
			st.setString(2, pname);
			st.setFloat(3, price);
			st.executeUpdate();
			System.out.println("Inserted");*/
			st = con.prepareStatement("insert into product values ("+pid+",'"+pname+"',"+price+")");
			st.executeUpdate();
			System.out.println("Inserted");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		finally
		{
			st.close();
			con.close();
		}
	}

}
