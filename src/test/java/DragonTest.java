import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {
    Dragon d;

    @Before
    public void setUp() throws Exception {
        d = new Dragon();
    }

    /**
     * Test if the sound dragon makes is expected
     */
    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Roar!!", d.sound());
    }

    /**
     * Test if the max speed of the dragon is expected
     */
    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(10, d.getMaxSpeed());
    }

    /**
     * Test if max speed of dragon is increased
     */
    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        d.upgradeSpeed();
        assertEquals(11, d.getMaxSpeed());
    }

    /**
     * Test if max speed of dragon is decreased
     */
    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        d.downgradeSpeed();
        assertEquals(9, d.getMaxSpeed());
    }

    /**
     * Test if price of dragon is expected
     */
    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(100, d.getPrice());
    }
}