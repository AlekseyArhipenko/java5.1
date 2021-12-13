package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'calculate count 1', 110, 368, 9",
    "'calculate count 2', 400, 900, 11",
    "'calculate count 3', 1000, 15000, 68"})
    void squaresOfValues(String name, int num1, int num2, int expected) {
        SQRService sqrService = new SQRService();

        int actual = SQRService.squaresOfValues(num1, num2);

        assertEquals(expected, actual);
    }
}