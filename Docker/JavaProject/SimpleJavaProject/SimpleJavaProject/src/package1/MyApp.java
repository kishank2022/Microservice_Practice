package package1;
import java.sql.Connection;
import java.sql.DriverManager;

public class MyApp {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		//String url = "jdbc:mysql://localhost:3306/docker_java_mysql";
		String url = "jdbc:mysql://mysql-db-container:3306/docker_java_mysql_1";
        String user = "root";
        String password = "root";
        
        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("Connected to MySQL successfully using docker network!!");
        con.close();
    }
}
