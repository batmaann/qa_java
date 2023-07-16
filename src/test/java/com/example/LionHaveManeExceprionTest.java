package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
@RunWith(MockitoJUnitRunner.class)

public class LionHaveManeExceprionTest {
    @Mock
    Feline feline;
    Lion lion;


    @Test
    public void testDoesHaveManeUnknownSexThrowsException() {
        try {
            lion = new Lion( "sex");
            fail("Ожидается Exception");
        } catch (Exception exception) {
            String expected = "Используйте допустимые значения пола животного - самей или самка";// я хз почему там самей, в самом класе Lion опечатка я не знаю так должно быть или нет
            String actual = exception.getMessage();
            assertEquals(expected, actual);
        }
    }
}




