package com.example.graalvm.tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ApplicationTest {
    private static Stream<Arguments> names() {
        return Stream.of(Arguments.of("Java"), Arguments.of("GraalVM"));
    }

    @Test
    public void testSayHello() {
        Application application = new Application();
        application.sayHello("World");
    }

    @ParameterizedTest
    @MethodSource("names")
    public void testSayHelloParameterized(String name) {
        Application application = new Application();
        application.sayHello(name);
    }
}
