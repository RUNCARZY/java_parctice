package basic.day20200409.codeTran;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodeTranTest {

    @Test
    void translate1() {
        long begin = System.currentTimeMillis();
        assertTrue(CodeTran.translateByBuffer("test/basic/day20200409/codeTran/utf_8.txt", "utf-8",
                "test/basic/day20200409/codeTran/gbk.txt", "gbk"));
        assertTrue(CodeTran.translateByBuffer("test/basic/day20200409/codeTran/gbk.txt", "gbk",
                "test/basic/day20200409/codeTran/utf_8_target.txt", "utf-8"));
        long end = System.currentTimeMillis();
        System.out.println("使用缓冲区耗费毫秒:" + (end - begin));
    }

    @Test
    void translate2() {
        long begin = System.currentTimeMillis();
        assertTrue(CodeTran.translateNoBuffer("test/basic/day20200409/codeTran/utf_8.txt", "utf-8",
                "test/basic/day20200409/codeTran/gbk.txt", "gbk"));
        assertTrue(CodeTran.translateByBuffer("test/basic/day20200409/codeTran/gbk.txt", "gbk",
                "test/basic/day20200409/codeTran/utf_8_target.txt", "utf-8"));
        long end = System.currentTimeMillis();
        System.out.println("不使用缓冲区耗费毫秒:" + (end - begin));
    }
}