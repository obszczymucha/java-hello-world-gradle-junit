package org.example;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MyHeapTest {
    @ParameterizedTest
    @DisplayName("Should do something.")
    @MethodSource("org.example.MyHeapTest#doSomethingProvider")
    void shouldDoSomething() {
        // Given

        // When

        // Then
    }

    @SuppressWarnings("unused")
    private static Stream<Arguments> doSomethingProvider() {
        return Stream.of();
    }
}
