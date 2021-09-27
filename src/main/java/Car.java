public class Car implements Tradable, Drivable{
    private String type;
    private int maxSpeed;
    public Car() {
        this.type = " ";
        this.maxSpeed = 100;
    }

    public void setName(String name){this.type = name;}

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {return 20;}
}
