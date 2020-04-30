package basic.day20200423;
/*
SpringJDBCTemplate封装了jdbc方法，可以更加方便进行使用

1. 传入连接池对象，创建JdbcTemplate对象
2. 使用JdbcTemplate对象实行sql语句
    常用方法：
    int update(String sql, Object... args) 执行DML语句，返回影响的行数
    Map<String, Object> queryForMap(String sql, Object... args) 将结果封装成一个Map，只能用于只有一个结果的查询
    List<Map<String, Object>> queryForList(String sql, Object... args) 将结果封装成Map的集合
    query(RowMapper)封装为JavaBean对象
        RowMapper<>接口，一般使用BeanPropertyRowMapper实现，可以完成数据到JavaBean的自动封装
        new BeanPropertyRowMapper<类型>(类型.class)
    queryForObject()将结果封装为对象，通常用于执行聚合函数
 */
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class SpringTemplateDemo {
    public static JdbcTemplate template;

    static{
        InputStream is = SpringTemplateDemo.class.getClassLoader().getResourceAsStream("druid.properties");
        Properties ps = new Properties();
        try {
            ps.load(is);
            template = new JdbcTemplate(DruidDataSourceFactory.createDataSource(ps));
        } catch (Exception e) {
            e.printStackTrace();
        }



    }

/*
        练习：
        1. 插入一条数据
        2. 查出一条数据封装为Map
        3. 查出多条数据封装为List
        4. 将查询结果封装为bean对象列表
            a. 重写RowMapper接口
            b. 使用BeanPropertyRowMapper类
        5. 将查询结果封装为object对象

 */
    public static int insert(String name, int age) {
        String sql = "INSERT INTO `student`(`name`, `age`) VALUES (?, ?);";
         return template.update(sql, name, age);
    }

    public static Map<String, Object> queryById(int id) {
        String sql = "SELECT * FROM `student` WHERE `id` = ?;";
        return template.queryForMap(sql, id);
    }

    public static List<Map<String, Object>> listAll() {
        String sql = "SELECT * FROM `student`;";
        return template.queryForList(sql);
    }

    public static List<Student> getBeanByName(String name) {
        String sql = "SELECT * FROM `student` WHERE `name` = ?;";
        return template.query(sql, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                Student student = new Student();
                student.setAge(age);
                student.setName(name);
                student.setId(id);
                return student;
            }
        }, name);
    }
    public static List<Student> getBeanByName2(String name) {
        String sql = "SELECT * FROM `student` WHERE `name` = ?;";
        return template.query(sql, new BeanPropertyRowMapper<Student>(Student.class), name);
    }

    public static Object countAll() {
        String sql = "SELECT COUNT(*) from `student`";
        return template.queryForObject(sql, Integer.class);
    }
}
