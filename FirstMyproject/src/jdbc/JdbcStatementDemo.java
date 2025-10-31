package jdbc;

import java.sql.*;
public class JdbcStatementDemo {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcd","root","root");
			//System.out.println("Connected");
			Statement st = con.createStatement();
			/*st.execute("create table product (pid int(3), pname varchar(10), price float(4))");
			System.out.println("Table created");*/
			/*st.executeUpdate("insert into product values (111,'monitor',5000)");
			st.executeUpdate("insert into product values (222,'keyboard',500)");
			st.executeUpdate("insert into product values (333,'mouse',300)");
			System.out.println("Inserted");*/
			/*int n = st.executeUpdate("update product set price=600");
			System.out.println(n+" records updated");*/
			/*int n = st.executeUpdate("delete from product");
			System.out.println(n+" records deleted");*/
			ResultSet rs = st.executeQuery("select * from product");
			while (rs.next())
			{
				System.out.println(rs.getInt("pid")+" "+rs.getString("pname")+" "+rs.getFloat(3));//3 is column no(price)
			}
			st.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
