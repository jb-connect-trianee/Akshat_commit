package json.jdbc.insert;

import java.sql.Connection;
import java.sql.DriverManager;

public class Read {
	public  Connection ConnectToDB() throws Exception {
	      DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	      String mysqlUrl = "jdbc:mysql://localhost/glau";
	      Connection con = DriverManager.getConnection(mysqlUrl, "root", "");
	      System.out.println("Connected");
	      return con;

}
}
