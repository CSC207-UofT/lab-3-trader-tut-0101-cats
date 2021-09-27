
public class Bike implements Drivable, Tradable{
    private int maxSpeed;

    /**
     * A bike that is tradable and drivable.
     */
    public Bike() { this.maxSpeed = 5; }

    /**
     * Speed up bike.
     */
    @Override
    public void upgradeSpeed() { this.maxSpeed = this.maxSpeed + 2; }

    /**
     * Slow down bike.
     */
    @Override
    public void downgradeSpeed() { this.maxSpeed = this.maxSpeed - 2; }

    /**
     * Get maximum speed of Bike.
     *
     * @return speed of Bike
     */
    @Override
    public int getMaxSpeed() { return this.maxSpeed; }

    /**
     * Get price of Bike.
     *
     * @return price of Bike
     */
    @Override
    public int getPrice() { return 15; }
}

