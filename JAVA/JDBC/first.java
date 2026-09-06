// steps in connecting db to java 
// 1. import the packages 
// 2. load & register the driver 
// 3. establish the connection 
// 4. create the statement 
// 5. execute the query 
// 6. process result 
// 7. close

// runnign while connecting to the database 

// # Compile your Java code
// javac PostgresConnect.java

// # Run using the driver in classpath
// java -cp .:/usr/local/share/java/postgresql.jar PostgresConnect


// package = java.sql*;
// driver varies on the database
// driver for mysql = com.mysql.jdbc.driver

// registering forName ("com.mysql.jdbc.driver");
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class first{
    public static void main(String[] args) throws Exception{
        String url = "jdbc:postgresql://localhost:5432/daemon";
        String username = "sagar";
        String password = "1234";
        String sql = "SELECT * FROM users";
        // String insertSql = "INSERT INTO users (id, username, email, created_at) VALUES (?, ?, ?, NOW())";
        // String selectSql = "SELECT id, username, email, created_at FROM users";
        try {
        Connection conn = DriverManager.getConnection(url, username, password);
        System.out.println("success");

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ": " + rs.getString("username") + " - " + rs.getString("email"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }  
    }
}