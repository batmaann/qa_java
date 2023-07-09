package com.example;

import com.sun.source.tree.AssertTree;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class LionTest {
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
                {"Самка", false}
        };
    }

    @Mock
    Feline feline;

    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion(sex);
        int result = lion.getKittens();
        assertEquals(1, result);
    }

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion(sex);
        boolean result = lion.doesHaveMane();
        Assert.assertEquals(hasMane, result);


    }


    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion(sex);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> result = lion.getFood();
        assertEquals(expected, result);

    }
}
