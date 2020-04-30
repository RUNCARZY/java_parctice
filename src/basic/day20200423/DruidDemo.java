package basic.day20200423;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import com.alibaba.druid.pool.DruidDataSourceFactory;

public class DruidDemo {
    public static DataSource ds;

    static {
        Properties prop = new Properties();
        try {
            InputStream is = DruidDemo.class.getClassLoader().getResourceAsStream("druid.properties");
            prop.load(is);
            System.out.println(prop.getProperty("username"));
            ds = DruidDataSourceFactory.createDataSource(prop);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public static String searchName(String name) {
        try(Connection conn = ds.getConnection()){
            System.out.println("成功连接");
            String sql = "SELECT * FROM student WHERE `name` = ?";
            System.out.println("SQL: " + sql);
            try(PreparedStatement ps = conn.prepareStatement(sql)){
                ps.setString(1, name);
                try(ResultSet rs = ps.executeQuery()) {
                    if(rs.next()) {
                        return rs.getString("name");
                    }else {
                        System.out.println("查询结果空");
                        return null;
                    }
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("出异常了！");
            return null;
        }
    }
}
