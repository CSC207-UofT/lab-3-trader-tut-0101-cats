public class Cat implements Tradable, Domesticatable, Drivable{

    @Override
    public int getPrice() {
        return 5;

    @Override
    public String sound() {
        return "Nya";
    }

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
        }
    }

