package flowers;

public class Main {
    public static void main(String[] args) {
	    FlowersProperties roseProperty = new FlowersProperties("red","winter", 10,"flet","flet");
	    Plants flower = new Flowers("Rose",50, roseProperty);
	    CactusProperties cactusProperties = new CactusProperties(true, 1, "Small", false, true);
	    Cactus cactus = new Cactus("Cucta", 60, cactusProperties);
	    System.out.println(flower);
	    System.out.println(cactus);
    }
}