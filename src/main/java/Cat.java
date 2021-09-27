public class Cat implements Tradable, Domesticatable, Drivable {

    @Override
    public String sound() {
        return "roar...";
    }

    @Override
    public void upgradeSpeed() {

    }

    @Override
    public void downgradeSpeed() {

    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
