package zzapr.Week05;

public class Car {



    private String manufacture;
    private String type;
    private int pricePaid;
    private int odometer;

    public Car(String manufacture, String type, int pricePaid, int odometer) {
        this.manufacture = manufacture;
        this.type = type;
        this.pricePaid = pricePaid;
        this.odometer = odometer;
    }

    public int getPricePaid() {
        return pricePaid;
    }

    public int getOdometer() {
        return this.odometer;
    }

    @Override
    public String toString(){
        String text = "";

        text += this.manufacture + " " + this.type + ": " + this.pricePaid + " EUR, " + "milwage: " + this.odometer + " km";

        return text;
    }
}
