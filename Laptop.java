import java.util.*;

public class Laptop {
    private String model;
    private String OZU;
    private String OS;
    private String weight;
    private String color;
    
    public Laptop(String model, String OZU, String OS, String weight, String color) {
        this.model = model;
        this.OZU = OZU;
        this.OS = OS;
        this.weight = weight;
        this.color = color;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getOZU() {
        return OZU;
    }
    public void setOZU(String OZU) {
        this.OZU = OZU;
    }
    public String getOS() {
        return OS;
    }
    public void setOS(String OS) {
        this.OS = OS;
    }
    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Laptop{" + "model='" + model + '\'' + ", OZU=" + OZU + ", OS='" + OS + '\'' + ", weight=" + weight + ", color='" + color + '\'' + '}';
    }
}
