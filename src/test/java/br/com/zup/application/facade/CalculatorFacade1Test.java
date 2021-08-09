package br.com.zup.application.facade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * This is a poor quality unit test, used as an example.
 */
@Disabled
@Deprecated
@SpringBootTest
@ExtendWith(SpringExtension.class)
public class CalculatorFacade1Test {

    @Autowired
    private CalculatorFacade calculatorFacade;

    @Test
    public void sumTest() {
        // Arrange
        int a = 7;
        int b = 8;

        // Act
        Integer result = calculatorFacade.sum(a, b);

        // Assert
        Assertions.assertNotNull(result);
    }

    @Test
    public void subtractTest() {
        // Arrange
        int a = 10;
        int b = 4;

        // Act
        Integer result = calculatorFacade.subtract(a, b);

        // Assert
        Assertions.assertNotNull(result);
    }

    @Test
    public void multiplyTest() {
        // Assert
        int a = 4;
        int b = 10;

        // Act
        Integer result = calculatorFacade.multiply(a, b);

        // Assert
        Assertions.assertNotNull(result);
    }

    @Test
    public void divideTest() {
        // Arrange
        int a = 12;
        int b = 4;

        // Act
        Integer result = calculatorFacade.divide(a, b);

        // Assert
        Assertions.assertNotNull(result);
    }

    @Test
    public void sumAndMultiplyTest() {
        // Arrange
        int a = 2;
        int b = 4;
        int c = 6;

        // Act
        Integer result = calculatorFacade.sumAndMultiply(a, b, c);

        // Assert
        Assertions.assertNotNull(result);
    }
}