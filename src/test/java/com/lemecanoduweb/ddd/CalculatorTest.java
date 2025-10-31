package com.lemecanoduweb.ddd;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests unitaires pour la classe Calculator
 */
class CalculatorTest {

    @Test
    void shouldAddTwoPositiveNumbers() {
        // Given
        Calculator calculator = new Calculator();
        
        // When
        int result = calculator.add(2, 3);
        
        // Then
        assertThat(result).isEqualTo(5);
    }

    @Test
    void shouldAddNegativeNumbers() {
        // Given
        Calculator calculator = new Calculator();
        
        // When
        int result = calculator.add(-5, -3);
        
        // Then
        assertThat(result).isEqualTo(-8);
    }

    @Test
    void shouldSubtractTwoNumbers() {
        // Given
        Calculator calculator = new Calculator();
        
        // When
        int result = calculator.subtract(10, 3);
        
        // Then
        assertThat(result).isEqualTo(7);
    }

    @Test
    void shouldSubtractNegativeNumber() {
        // Given
        Calculator calculator = new Calculator();
        
        // When
        int result = calculator.subtract(5, -3);
        
        // Then
        assertThat(result).isEqualTo(8);
    }
}
