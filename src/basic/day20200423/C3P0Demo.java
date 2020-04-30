package basic.day20200423;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C3P0Demo {
    public static DataSource ds= new ComboPooledDataSource();
    public static String searchStudent(String name) throws SQLException {
        try(Connection conn = ds.getConnection()/*,
                PreparedStatement ps = conn.prepareStatement()*/){
            System.out.println("成功连接");
            String sql = "SELECT * FROM student WHERE name = ?";
            try(PreparedStatement ps = conn.prepareStatement(sql)){
                ps.setString(1, name);
                try(ResultSet rs = ps.executeQuery()) {
                    if(rs.next()) {
                        return rs.getString("name");
                    }else return null;
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }




    }
}
