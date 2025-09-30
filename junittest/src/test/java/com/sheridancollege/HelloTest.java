package com.sheridancollege;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloTest {
    @Test
    public void TestsayHell(){
        hello hello = new hello();
        assertEquals("hello",hello.sayHello());

    }
}
