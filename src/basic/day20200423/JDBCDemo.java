package basic.day20200423;

import java.sql.*;

/*
JDBC定义了一套操作所有关系型数据库的接口，由各个数据库产商自己去实现数据库驱动。

使用JDBC操作mysql的方法
1. 导入mysql驱动jar包
2. 注册驱动（高版本mysql不需要手动驱动）
3. 使用驱动管理(DriverManager.getConnection)获取连接对象 Connection
4. 获取操作数据库对象
    Statement：用于执行静态sql语句
    PreparedStatement：用于执行预sql操作语句

5. 使用操作数据库对象发送sql指令
    Statement/PreparedStatement方法，其中，使用Statement对象需要在方法中传入sql语句
        boolean execute() 执行任意sql语句
        int executeUpdate() 执行DML(insert, update, delete)语句和DDL语句
        ResultSet executeQuery() 执行查询语句

6. 处理返回结果
    ResultSet方法
    boolean next() 游标向下移动一行
    XXX getXXX(参数) 获取XXX类型的数据
        传入参数为int类型代表列编号（从1开始），传入String参数类型代表列名称

7. 释放资源

=============================
事务管理

连接池
供应商实现javax.sql.DataSource 接口
获取连接：get Connection
归还连接：如果连接对象是从连接池中获取的，那么调用Connection.close方法不会关闭连接，而是归还连接
连接池实现技术：
1、C3P0
    获取连接池ComboPooledDataSource方法：
    a. 硬编码
    b. 使用c3p0.properties或者c3p0-config.xml进行配置，会自动加载

2、Druid 阿里巴巴提供
    获取连接池方法：
    1.使用.properties配置文件
    2.将属性流传入DruidDataSourceFactory.createDataSource，获取连接池对象

 */
public class JDBCDemo {


    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.1.106:3306/student", "run", "123456");
        Statement statement = conn.createStatement();
//        String sql = "CREATE TABLE student(id int primary key, name varchar(10), age int)";
        String sql = "SELECT * FROM student WHERE NAME = `LiHua`";
//        int res = statement.executeUpdate(sql);
        ResultSet res = statement.executeQuery(sql);
        System.out.println(res);
        statement.close();
        conn.close();
    }
}
