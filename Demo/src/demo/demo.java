package demo;
import java.sql.*;
public class demo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/information","root","Password08");
			Statement state=connect.createStatement();
			ResultSet res=state.executeQuery("select * from kaviya_info");
			while(res.next())
			{
				System.out.println(res.getString(1)+res.getString(2)+res.getString(3)+res.getString(4));
			}
		}
       catch(Exception e)
		{
	System.out.println(e.toString());
		}
	}

}
