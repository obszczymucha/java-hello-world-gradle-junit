package org.example;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

import lombok.val;

public class AppTest {
    @Test
    public void shouldReturnAppropriateGreeting() {
        // Given
        val app = new App();

        // When
        val result = app.getGreeting();

        // Then
        assertThat(result).isEqualTo("Hello World!");
    }
}
