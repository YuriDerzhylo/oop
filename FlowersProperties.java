package flowers;

public class FlowersProperties {
    private String color;
    private String seasonality;
    private int freshness;
    private String typeOfBud;
    private String formsOfPetals;

    public FlowersProperties(String color, String seasonality, int freshness, String typeOfBud, String formsOfPetals) {
        this.color = color;
        this.seasonality = seasonality;
        this.freshness = freshness;
        this.typeOfBud = typeOfBud;
        this.formsOfPetals = formsOfPetals;
    }

    @Override
    public String toString() {
        return "FlowersProperties{" +
                "color='" + color + '\'' +
                ", seasonality='" + seasonality + '\'' +
                ", freshness=" + freshness +
                ", typeOfBud='" + typeOfBud + '\'' +
                ", formsOfPetals='" + formsOfPetals + '\'' +
                '}';
    }
}
