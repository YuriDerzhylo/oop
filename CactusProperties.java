package flowers;

public class CactusProperties {
	private boolean bloom;
	private int yearsCount;
	private String size;
	private boolean withSpines;
	private boolean decorative;
	
	public CactusProperties(boolean bloom, int i, String size, boolean withSpines, boolean decorative) {
        this.bloom = bloom;
        this.yearsCount = i;
        this.size = size;
        this.withSpines = withSpines;
        this.decorative = decorative;
    }
	
	@Override
    public String toString() {
        return "FlowersProperties{" +
                "bloom='" + bloom + '\'' +
                ", yearsCount='" + yearsCount + '\'' +
                ", size=" + size +
                ", withSpines='" + withSpines + '\'' +
                ", decorative='" + decorative + '\'' +
                '}';
    }
}
