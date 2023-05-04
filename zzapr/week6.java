package week6;

public class week6 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(100, 120, 150);
        vehicle.stampVehicle();

        Person owner = new Person("Giuseppe", "Ortolano", 22);

        Scooter scooter = new Scooter(26, 45, 10, owner, "IT800A");
        scooter.stampScooter();
        scooter.stampVehicle();
        scooter.turnOn();
        scooter.turnOff();

        Airplane plane = new Airplane(120, 450, 12, "Rynair", 1200);
        plane.stampPlane();
        plane.stampVehicle();
        plane.land();
    }
}
