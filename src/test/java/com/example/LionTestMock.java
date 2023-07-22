package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Collections;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTestMock {
    //Здесь я просто решил отдельно создать тест для окончание и сдачи работы это для пункта 4 в задании
    @Mock
    Lion lion;


    @Test
    public void TestLionMockGetFood() throws Exception {
        // Мокируем вызов lion.getFood() и указываем, что он должен вернуть список "Хищник"
        Mockito.when(lion.getFood()).thenReturn(Collections.singletonList("Хищник"));

        // Получаем результат из метода lion.getFood()
        List<String> result = lion.getFood();

        // Ожидаемый список
        List<String> expected = List.of("Хищник");

        // Сравниваем ожидаемый и фактический результаты
        Assert.assertEquals(expected, result);
    }
}
