package jdbc;

import java.sql.*;
public class JdbcStatementDemo1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcd","root","root");
			Statement st = con.createStatement();
			/*st.execute("create table books(bookid int(5), bname varchar(10), price float(5))");
			System.out.println("Table Created");*/
			/*st.execute("alter table books modify price varchar(10)");
			System.out.println("Table Modified");*/
			/*st.executeUpdate("insert into books values(1001,'Core Java','$100')");
			st.executeUpdate("insert into books values(1002,'Angular','$60')");
			st.executeUpdate("insert into books values(1003,'AWS BASICS','$150')");
			System.out.println("Records inserted into the table");*/
			/*st.executeUpdate("update books set price='$120' where bookid=1003");
			System.out.println("Record updated");*/
			/*st.executeUpdate("delete from books where bookid=1002");
			System.out.println("Record deleted");*/
			ResultSet rs = st.executeQuery("select * from books");
			while(rs.next())
			{
				System.out.println(rs.getInt("bookid")+" "+rs.getString("bname")+" "+rs.getString("price"));
			}
			st.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
