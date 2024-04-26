package org.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import lombok.val;

public class AppTest {
    @ParameterizedTest
    @CsvSource({
            ", Hello world!",
            "Princess, Hello Princess!",
            "kenny, Hello kenny!",
    })
    public void shouldReturnAppropriateGreeting(String given, String expected) {
        // Given
        val app = new App();

        // When
        val result = app.getGreeting(given);

        // Then
        assertThat(result).isEqualTo(expected);
    }
}
