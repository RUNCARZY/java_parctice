package basic.day20200407;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CopyCaseTest {

    @Disabled
    @Test
    void copy() {
        assertTrue(CopyCase.copy(new String[]{"D:\\JavaProject\\java_practice\\src\\basic\\day20200407\\test.txt",
                "D:\\JavaProject\\java_practice\\src\\basic\\day20200407\\test2.txt"}));
        assertFalse(CopyCase.copy(new String[]{"D:\\JavaProject\\java_practice\\src\\basic\\day20200407\\test3.txt",
                "D:\\JavaProject\\java_practice\\src\\basic\\day20200407\\test2.txt"}));
    }
}