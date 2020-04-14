package basic.day20200414;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) throws SQLException {
        final String JDBC_URL = "jdbc:mysql://192.168.9.54:3306/test";
        String JDBC_USER = "root";
        String JDBC_PASSWORD = "123456";
        Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery("SELECT `id`, `age`, `name` FROM `member`");
        while(rs.next()) {
            int id = rs.getInt(1);
            int age = rs.getInt(2);
            String name = rs.getString(3);
            System.out.println(name+id+age);
        }
    }
}
