import java.sql.*;
public class CRUDOperations {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5000/FirstDB";
        String user = "postgres";
        String password = "Dheeraj#1234";
        String create = "insert into \"FirstTable\" values (5, 'Rajam', 24)";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement st = conn.createStatement();
            System.out.println(st.execute(create)); //Print false when insert or update query is being executed
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
