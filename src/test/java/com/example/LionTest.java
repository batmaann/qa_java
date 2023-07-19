package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)

public class LionTest extends TestCase {
    private final String sex;
    private final boolean hasMane;
    public LionTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getSex() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }



    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion(new Feline(),sex);
        int result = lion.getKittens();
        assertEquals(1, result);
    }
    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion(new Feline(),sex);
        boolean result = lion.doesHaveMane();
        assertEquals(hasMane, result);
    }



    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion(new Feline(), sex);

        try {
            List<String> expectedResult  = new ArrayList<>();
            expectedResult.addAll(0, Arrays.asList("Животные", "Птицы", "Рыба"));
            assertEquals(expectedResult, lion.getFood());
        } catch (ArithmeticException e) {
            fail("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }
    //пожалуйста не ругайтесь что я всё в одном классе делаю, просто я художник и я так вижу
    // написал всё в одном потому что думал так меньшие кода
    @Test
    public void testGetFoodException() throws Exception {
        try {
            Lion lion = new Lion(new Feline(), "sex");
            fail("Ожидается Exception");
        } catch (Exception exception) {
            String expectedResult = "Используйте допустимые значения пола животного - самей или самка";
            String actual = exception.getMessage();
            assertEquals(expectedResult, actual);
        }
    }
}

