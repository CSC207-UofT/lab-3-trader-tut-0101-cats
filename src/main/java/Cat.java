public class Cat implements Tradable, Domesticatable, Drivable {
    private int maxSpeed;

    /**
     * A Freaking Tradable, Domesticatable Drivable Cat. Oh dear, what have I
     * done :D :D :D?
     *
     */
    public Cat() {
        this.maxSpeed = 1000;
    }

    /**
     * Returns the sound the cat makes. What does the Fox say?
     * @return The sound the cat makes
     */
    @Override
    public String sound() {
        return "roar...";
    }

    /**
     * Makes this cat Usain Bolt
     */
    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 10;
    }

    /**
     * Make this cat old and slow.
     */
    @Override
    public void downgradeSpeed() {
        this.maxSpeed -= 10;
    }

    /**
     * What is the maximum speed of this thing?
     *
     * @return The speed of the wild beast
     */
    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Wait? We are selling this?
     * @return The Price of the cat.
     */
    @Override
    public int getPrice() {
        int z = this.maxSpeed;
        return z * 1000;
    }
}
