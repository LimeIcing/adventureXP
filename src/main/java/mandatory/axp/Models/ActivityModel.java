package mandatory.axp.Models;

public class ActivityModel {
    private int id;
    private String name;
    private int duration, minAge, minHeightCm;
    private double price;

    public ActivityModel() {
    }

    public ActivityModel(int id ,String name, int duration, int minAge, int minHeightCm, double price) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.minAge = minAge;
        this.minHeightCm = minHeightCm;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
