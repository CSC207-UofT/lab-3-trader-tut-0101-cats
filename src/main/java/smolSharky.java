/* A sample class that implements the given interfaces.
 */
public class smolSharky implements Domesticatable, Tradable {
    private int maxSpeed;

    public smolSharky() {
        this.maxSpeed = 9;
    }

    @Override
    public String sound() {
        return "A!~~~";
    }

    @Override
    public int getPrice() {
        return 9001;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
