package quanlysinhvien;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:sqlserver://LAPTOP-NMNR5KI2\\SQLEXPRESS:1433;databaseName=QuanLySinhVienJV;encrypt=true;trustServerCertificate=true;";
    private static final String USER = "chip"; 
    private static final String PASSWORD = "123456"; 

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void main(String[] args) {
        try (Connection connection = getConnection()) {
            System.out.println("Connected successfully!");
        } catch (SQLException e) {
            System.out.println("Cannot connect to database!");
            e.printStackTrace();
        }
    }
}
