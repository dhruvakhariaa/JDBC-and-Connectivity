import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) {
        /*
        * Import Package
        * Load the driver and register
        * Create connection
        * Create statement
        * Execute statements
        * Process the results
        * Close
        * */

        try{
            Class.forName("org.postgresql.Driver"); //Optional
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url = "jdbc:postgresql://localhost:5000/FirstDB";
        String uname = "postgres";  //Default username
        String pass = "Dheeraj#1234";
        //The postgresql does not directly take case-sensitive words, that's why use such a syntax
        String read = "SELECT * FROM \"FirstTable\"";

        try {
            Connection conn = DriverManager.getConnection(url, uname, pass);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(read); //executeQuery() is used ONLY to fetch data
            while (rs.next()) {
//              String name = rs.getString("Name");
//              int age = rs.getInt("Age");
                String name = rs.getString(2);
                int age = rs.getInt(1);
                int id = rs.getInt("ID");
                System.out.println("Student "+id + " name is "+ name + " and his age is " + age);
            }
            rs.close();
            st.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



        System.out.println( "Connection successfully closed");

    }
}
