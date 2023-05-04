package week6;

public class Scooter extends Vehicle {
    private Person owner;

    public Person getOwner() {
        return owner;
    }
    public void setOwner(Person owner) {
        this.owner = owner;
    }
    private String plate;

    public String getPlate() {
        return plate;
    }
    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Scooter(int length, int width, int height, Person owner, String plate) {
        super(length, width, height);
        this.owner = owner;
        this.plate = plate;
    }

    public void stampScooter() {
        System.out.println("Owner: " + this.getOwner() + ", Plate: " + this.getPlate());
    }

    public void turnOn() {
        System.out.println("Turn on the scooter");
    }

    public void turnOff() {
        System.out.println("Turn off the scooter");
    }

}
