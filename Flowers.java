package flowers;

public class Flowers extends Plants {
    private FlowersProperties properties;

    public Flowers(String name, int price, FlowersProperties properties) {
        super(name, price);
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Flowers{" +
                "properties=" + properties +
                '}';
    }

}