import org.junit.*;

import static org.junit.Assert.*;


public class CarTest {
    Car c;

    @Before
    public void setUp() throws Exception {
        c = new Car();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(100, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        c.upgradeSpeed();
        assertEquals(102, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        c.downgradeSpeed();
        assertEquals(99, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(20, c.getPrice());
    }

}