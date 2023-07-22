package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest extends TestCase {
    // Arrange
    Feline feline = new Feline();

    @Test
    public void testEatMeat() throws Exception {
        List<String> actualResult = feline.eatMeat();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGetFamily() {
        assertEquals(feline.getFamily(), "Кошачьи");
    }

    @Test
    public void testGetKittens() {
        // Act
        int result = feline.getKittens();
        // Assert
        assertEquals(1, result);
    }

    @Test
    public void testTestGetKittens() {

        // Act
        int result = feline.getKittens(1);
        int expected = 1;
        // Assert
        assertEquals(expected, result);

    }

}
