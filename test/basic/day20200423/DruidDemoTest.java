package basic.day20200423;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DruidDemoTest {

    @Test
    void searchName() {
        Assertions.assertEquals("LiHua", DruidDemo.searchName("LiHua"));
    }
}