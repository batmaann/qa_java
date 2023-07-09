package com.example;

import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest extends TestCase {
    @Mock
    Feline feline;
    Cat cat = new Cat(feline);

    @Test
    public void testGetSound() {
        assertEquals("Мяу", cat.getSound());

    }

    @Test
    public void testGetFood() throws Exception {
        Cat cat = new Cat(feline);
        cat.getFood();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();
    }

}

