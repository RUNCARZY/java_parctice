package basic.day20200423;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpringTemplateDemoTest {

    @Test
    void insert() {
        Assertions.assertEquals(1, SpringTemplateDemo.insert("Hermine", 16));
    }

    @Test
    void queryById() {
        System.out.println(SpringTemplateDemo.queryById(2));
    }

    @Test
    void listAll() {
        System.out.println(SpringTemplateDemo.listAll());
    }

    @Test
    void getBeanByName() {
        System.out.println(SpringTemplateDemo.getBeanByName("Hermine"));
    }

    @Test
    void getBeanByName2() {
        System.out.println(SpringTemplateDemo.getBeanByName2("Hermine"));
    }

    @Test
    void queryForObject() {
        Assertions.assertEquals(3, SpringTemplateDemo.countAll());
    }
}