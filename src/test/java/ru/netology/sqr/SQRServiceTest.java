package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'calculate the amount in the limit', 110, 368, 9",
            "'calculate count out of bounds', 101, 103, 0",
            "'calculate the boundary amount', 100, 121, 2",
            "'calculate quantity over range', 9802, 16869, 0"})
    void squaresOfValues(String name, int num1, int num2, int expected) {
        SQRService sqrService = new SQRService();

        int actual;
        actual = SQRService.squaresOfValues(num1, num2);

        assertEquals(expected, actual);
    }
}