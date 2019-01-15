package flowers;

public class Cactus extends Plants {
	 private CactusProperties properties;
	
    public Cactus(String name, int price, CactusProperties properties) {
        super(name, price);
        this.properties = properties;
    }
    
    @Override
    public String toString() {
        return "Cactus{" +
                "properties=" + properties +
                '}';
    }
}