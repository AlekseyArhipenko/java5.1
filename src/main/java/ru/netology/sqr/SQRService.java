package ru.netology.sqr;

public class SQRService {
    public static int squaresOfValues(int num1, int num2) {
        int count = 0;
        for (int i = 10; i <= 99; i = i + 1)
            if (i * i >= num1 && i * i <= num2) {
                count = count + 1;
            }
        return count;
    }
}
