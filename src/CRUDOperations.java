//Genuine tip from author : Always try to keep your table name and column name in small letters

import java.sql.*;
public class CRUDOperations {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5000/FirstDB";
        String user = "postgres";
        String password = "Dheeraj#1234";
        String create = "insert into \"FirstTable\" values (5, 'Rajam', 24)";
        String update = "update \"FirstTable\" set \"Name\" = 'Raja' where \"Id\" = 5";
        String delete = "delete from \"FirstTable\" where \"Id\" = 5";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement st = conn.createStatement();
//            st.execute(create); //Print false when insert or update query is being executed
//            st.execute(update);
            st.execute(delete);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
