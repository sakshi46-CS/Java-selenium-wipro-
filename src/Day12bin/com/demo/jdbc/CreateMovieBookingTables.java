package Day12bin.com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateMovieBookingTables {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String pass = "root";
        String dbName = "MovieBookingDB";

        try (Connection conn = DriverManager.getConnection(url, user, pass);
             Statement stmt = conn.createStatement()) {

            String createDB = "CREATE DATABASE IF NOT EXISTS " + dbName;
            stmt.executeUpdate(createDB);
            System.out.println("Database created successfully: " + dbName);

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Step 2: Connect to DB and create tables
        try (Connection conn = DriverManager.getConnection(url + dbName, user, pass);
             Statement stmt = conn.createStatement()) {

            String createMovieTable = """
                CREATE TABLE IF NOT EXISTS Movie (
                    movie_id INT PRIMARY KEY AUTO_INCREMENT,
                    title VARCHAR(255) NOT NULL,
                    genre VARCHAR(50) NOT NULL,
                    rating DECIMAL(3,1) NOT NULL,
                    status VARCHAR(20) NOT NULL,
                    poster_image_url VARCHAR(255) DEFAULT NULL
                );
            """;

            String createScreenTable = """
                CREATE TABLE IF NOT EXISTS Screen (
                    screen_id INT PRIMARY KEY AUTO_INCREMENT,
                    name VARCHAR(50) NOT NULL,
                    class_type VARCHAR(10) NOT NULL,
                    capacity INT NOT NULL
                );
            """;

            String createSeatTable = """
                CREATE TABLE IF NOT EXISTS Seat (
                    seat_id INT PRIMARY KEY AUTO_INCREMENT,
                    screen_id INT NOT NULL,
                    seat_number VARCHAR(10) NOT NULL,
                    FOREIGN KEY (screen_id) REFERENCES Screen(screen_id)
                );
            """;

            String createMovieCastTable = """
                CREATE TABLE IF NOT EXISTS MovieCast (
                    cast_id INT PRIMARY KEY AUTO_INCREMENT,
                    movie_id INT NOT NULL,
                    person_name VARCHAR(100) NOT NULL,
                    role VARCHAR(100) NOT NULL,
                    FOREIGN KEY (movie_id) REFERENCES Movie(movie_id)
                );
            """;

            String createReviewTable = """
                CREATE TABLE IF NOT EXISTS Review (
                    review_id INT PRIMARY KEY AUTO_INCREMENT,
                    movie_id INT NOT NULL,
                    content TEXT NOT NULL,
                    review_date DATETIME NOT NULL,
                    reviewer_name VARCHAR(100) NOT NULL,
                    FOREIGN KEY (movie_id) REFERENCES Movie(movie_id)
                );
            """;

            String createShowTable = """
                CREATE TABLE IF NOT EXISTS ShowTable (
                    show_id INT PRIMARY KEY AUTO_INCREMENT,
                    screen_id INT NOT NULL,
                    movie_id INT NOT NULL,
                    show_datetime DATETIME NOT NULL,
                    FOREIGN KEY (screen_id) REFERENCES Screen(screen_id),
                    FOREIGN KEY (movie_id) REFERENCES Movie(movie_id)
                );
            """;

            String createShowSeatTable = """
                CREATE TABLE IF NOT EXISTS ShowSeat (
                    show_seat_id INT PRIMARY KEY AUTO_INCREMENT,
                    show_id INT NOT NULL,
                    seat_id INT NOT NULL,
                    is_available BOOLEAN NOT NULL DEFAULT TRUE,
                    FOREIGN KEY (show_id) REFERENCES ShowTable(show_id),
                    FOREIGN KEY (seat_id) REFERENCES Seat(seat_id)
                );
            """;

            // Execute all
            stmt.execute(createMovieTable);
            stmt.execute(createScreenTable);
            stmt.execute(createSeatTable);
            stmt.execute(createMovieCastTable);
            stmt.execute(createReviewTable);
            stmt.execute(createShowTable);
            stmt.execute(createShowSeatTable);

            System.out.println("Tables created successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
