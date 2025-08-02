package Day12bin.com.demo.jdbc;

import java.sql.*;

public class JDBCdemo2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/demo";
        String userName = "root";
        String pwd = "root";
        String query = "SELECT * FROM demo";

        // Load and register driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish connection
        Connection con = DriverManager.getConnection(url, userName, pwd);

        // Create statement and execute query
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        // Process result
        while (rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            String email = rs.getString(3); // Only if this column exists
            System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
        }

        // Close resources
        rs.close();
        st.close();
        con.close();
    }
}
