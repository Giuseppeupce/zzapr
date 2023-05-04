package week6;

public class Vehicle {
    private int length;

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    
    private int width;

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    private int height;

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public Vehicle(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void stampVehicle() {
        System.out.println("Length: " + this.getLength() + ", Width: " + this.getWidth() + ", Height: " + this.getHeight());
    }
}
