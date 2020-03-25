package basic.day20200325.date;

import java.util.Date;

/*
java.util.Date: 表示特定的瞬间，精确到毫秒

 */
public class DateDemo {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()); // 获取当前系统时间戳（精确到毫秒值），long类型
        // Date空参构造方法，获取当前系统时间
        Date today = new Date();
        System.out.println(today);

        // Date(long date) 时间戳参数
        Date begin = new Date(0L);
        System.out.println(begin);

        // 常用方法：
        // long getTime() 把时间转换成时间戳
        System.out.println(today.getTime());
    }

}
