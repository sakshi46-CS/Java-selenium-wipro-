package Day12bin.com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/demo";
        String userName = "root";
        String pwd = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL driver not found");
            e.printStackTrace();
            return;
        }

        try (Connection conn = DriverManager.getConnection(url, userName, pwd);
             Statement st = conn.createStatement()) {

            // Corrected create table statement
            String user  = "CREATE TABLE IF NOT EXISTS sampletable (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(100), number VARCHAR(10))";

            st.executeUpdate(user);
            System.out.println("Table sampletable is created");

            String val = "INSERT INTO sampletable (name, number) VALUES (?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(val)) {
                ps.setString(1, "siva");
                ps.setString(2, "7671"); // number is varchar, so pass as string
                ps.addBatch(); // add to batch
                int[] arr = ps.executeBatch();
                long count = java.util.stream.IntStream.of(arr).filter(c -> c > 0).count();
                System.out.printf("Inserted rows: %d%n", count);
            }
            st.close();
            conn.close();

        }
    }
}
