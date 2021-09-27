/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class CatTest {
    Cat h;

    @Before
    public void setUp() throws Exception {
        h = new Cat();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("roar...", h.sound());
    }
}
