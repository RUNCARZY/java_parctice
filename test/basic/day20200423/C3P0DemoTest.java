package basic.day20200423;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class C3P0DemoTest {

    @Test
    void searchStudentTest1() throws SQLException {
        Assertions.assertEquals(C3P0Demo.searchStudent("LiHua"), "LiHua");
    }

    @Test
    void searchStudentTest2() throws SQLException {
        Assertions.assertNull(C3P0Demo.searchStudent("LiLi"));
    }
}