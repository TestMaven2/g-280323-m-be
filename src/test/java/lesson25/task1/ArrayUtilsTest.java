package lesson25.task1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayUtilsTest {

    private int[] result;

    // Тест кейсы:
    // 1. Проверить внутреннее содержание массива.
    // 2. Проверить, нужного ли размера массив.
    // 3. Проверить, не null ли наш массив.
    // 4. Выбрасывается ли нужная ошибка в определённых обстоятельствах.

    @Before
    public void init() {
        result = ArrayUtils.getArrayBySize(7);
    }

    // 1,2,3,4,5,6,7
    @Test
    public void checkInnerValue() {
        int expected = 5;
        int actual = result[4];
        assertEquals("Проверка внутреннего значения массива", expected, actual);
    }

    @Test
    public void checkCorrectSize() {
        int expected = 7;
        int actual = result.length;
        assertEquals("Проверка размера массива", expected, actual);
    }

    @Test
    public void checkNotNull() {
        assertNotNull("Проверка, не возвращается ли null", result);
    }

    @Test(expected = RuntimeException.class)
    public void checkExpectedException() {
        int[] result = ArrayUtils.getArrayBySize(-3);
    }

    @Test
    public void checkExpectedExceptionSecondWay() {
        try {
            int[] result = ArrayUtils.getArrayBySize(-3);
        } catch (RuntimeException e) {
            return;
        }
        fail();
    }
}