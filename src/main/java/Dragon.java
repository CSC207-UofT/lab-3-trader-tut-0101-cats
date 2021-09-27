public class Dragon implements Drivable, Domesticatable, Tradable {
    private int maxSpeed;

    public Dragon() {
        this.maxSpeed = 10;
    }

    /**
     *
     * @return the sound the dragon makes
     */
    @Override
    public String sound() {
        return "Roar!!";
    }

    /**
     * Increase the speed of the dragon
     */
    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    /**
     * Decrease the speed of the dragon
     */
    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    /**
     *
     * @return The max speed of the dragon
     */
    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     *
     * @return The price of the dragon
     */
    @Override
    public int getPrice() {
        return 100;
    }

    /**
     *
     * @return The id of the dragon with its max speed
     */
    @Override
    public String toString() {
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}