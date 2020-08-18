package com.baeldung.quarkus;

import org.junit.jupiter.api.Disabled;

import io.quarkus.test.junit.NativeImageTest;

@Disabled("to be fixed")
@NativeImageTest
public class NativeHelloResourceIT extends HelloResourceTest {

    // Execute the same tests but in native mode.
}