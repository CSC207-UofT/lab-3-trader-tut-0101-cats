/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class smolSharkyTest {
    smolSharky sharky;

    @Before
    public void setUp() throws Exception {
        sharky = new smolSharky();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("A!~~~", sharky.sound());
    }


    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(9001, sharky.getPrice());
    }
}