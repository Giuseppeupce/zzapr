package week6;

public class Airplane extends Vehicle {
    private String model;

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    private int power;

    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }

    public Airplane(int length, int width, int height, String model, int power) {
        super(length, width, height);
        this.model = model;
        this.power = power;
    }

    public void stampPlane() {
        System.out.println("Model: " + this.getModel() + ", Power: " + this.getPower());
    }

    public void land() {
        System.out.println("Airplane landed");
    }
    
}
