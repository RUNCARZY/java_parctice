package basic.day20200421;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UseAnnotationTest {

    @Test
    void seatsTest1() {
        try {
            new UseAnnotation().seats(20);
        } catch (Exception e) {
            e.printStackTrace();
            Assertions.fail();
        }
    }

    @Test
    void seatsTest2() {
        try {
            new UseAnnotation().seats(-1);
            Assertions.fail();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    void seatsTest3() {
        try {
            new UseAnnotation().seats(200);
            Assertions.fail();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}