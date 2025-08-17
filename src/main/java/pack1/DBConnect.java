package pack1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect
{
	private DBConnect() {}
	
	private static Connection con;
	
	static 
	{
		try
		{
			Class.forName(DbInfo.driver);
			con=DriverManager.getConnection(DbInfo.url,DbInfo.usn,DbInfo.pwd);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static Connection getCon()
	{
		return con;
	}
}