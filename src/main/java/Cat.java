public class Cat implements Tradable, Domesticatable, Drivable {
    private int maxSpeed;

    /**
     * A cat
     *
     */
    public Cat() {
        this.maxSpeed = 1000;
    }

    /**
     * Returns the sound the cat makes.
     * @return The sound of the cat
     */
    @Override
    public String sound() {
        return "roar...";
    }

    /**
     * Upgrade the speed of the cat
     */
    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 10;
    }

    /**
     * Downgrade the max speed of the cat
     */
    @Override
    public void downgradeSpeed() {
        this.maxSpeed -= 10;
    }

    /**
     * Get the max speed of the cat
     *
     * @return The max speed of the cat
     */
    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Get the price of the cat
     * @return The Price of the cat.
     */
    @Override
    public int getPrice() {
        int z = this.maxSpeed;
        return z * 1000;
    }
}
