package mandatory.axp.Models;

public class ActivityModel {
    private String name;
    private int durationMin, minAge, minHeightCm;
    private float price;

    public ActivityModel() {
    }

    public ActivityModel(int id ,String name, int durationMin, int minAge, int minHeightCm, float price) {
        this.name = name;
        this.durationMin = durationMin;
        this.minAge = minAge;
        this.minHeightCm = minHeightCm;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public void setDurationMin(int durationMin) {
        this.durationMin = durationMin;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public int getMinHeightCm() {
        return minHeightCm;
    }

    public void setMinHeightCm(int minHeightCm) {
        this.minHeightCm = minHeightCm;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
