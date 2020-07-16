package com.example;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciTest {

    @Test
    public void shouldReturnThirdElement() {

        int result = Fibonacci.get(7);

        assertThat(result).isEqualTo(21);

    }

}
