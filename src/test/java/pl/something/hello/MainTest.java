package pl.something.hello;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void sumShouldBeZero() {
        int result = Main.sum(0,0,0);
        Assertions.assertEquals(0, result);
    }

    @Test
    void sumShouldBeOne() {
        int result = Main.sum(0,0,0);
        Assertions.assertEquals(1, result);
    }
}
