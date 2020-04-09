package basic.day20200409.codeTran;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodeTranTest {

    @Test
    void translate() {
        assertTrue(CodeTran.translate("test/basic/day20200409/codeTran/utf_8.txt", "utf-8",
                "test/basic/day20200409/codeTran/utf_8.txt", "gbk"));
        assertTrue(CodeTran.translate("test/basic/day20200409/codeTran/gbk.txt", "gbk",
                "test/basic/day20200409/codeTran/utf_8_target.txt", "utf-8"));
    }
}