package br.com.zup.application.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CalculatorServiceTest {

    private CalculatorService calculatorService;

    @BeforeEach
    public void init() {
        this.calculatorService = new CalculatorService();
    }

    @Test
    public void sumTest() {
        // Arrange
        int a = 7;
        int b = 8;
        int expectedResult = 15;

        // Act
        Integer result = calculatorService.sum(a, b);

        // Assert
        Assertions.assertEquals(result, expectedResult);
    }

    @Test
    public void subtractTest() {
        // Arrange
        int a = 10;
        int b = 8;
        int expectedResult = 2;

        // Act
        Integer result = calculatorService.subtract(a, b);

        // Assert
        Assertions.assertEquals(result, expectedResult);
    }

    @Test
    public void multiplyTest() {
        // Arrange
        int a = 3;
        int b = 7;
        int expectedResult = 21;

        // Act
        Integer result = calculatorService.multiply(a, b);

        // Assert
        Assertions.assertEquals(result, expectedResult);
    }

    @Test
    public void divideTest() {
        // Arrange
        int a = 12;
        int b = 4;
        int expectedResult = 3;

        // Act
        Integer result = calculatorService.divide(a, b);

        // Assert
        Assertions.assertEquals(result, expectedResult);
    }

    @Test
    public void divideByZeroTest() {
        // Arrange
        int a = 12;
        int b = 0;

        // Act
        Exception exception = Assertions.assertThrows(ArithmeticException.class,
                () -> calculatorService.divide(a, b));

        // Assert
        Assertions.assertEquals("Division by zero", exception.getMessage());
    }

}