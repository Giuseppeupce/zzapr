package zzapr.Week05;

public class Garage {
    final static int MAX_CARS_GARAGE = 100;
    private int carCounter = 0;
    Car[] cars = new Car[MAX_CARS_GARAGE];

    public void addCarToGarage(Car car) {
        //TODO write a logic here
        if (carCounter < MAX_CARS_GARAGE && car != null) {
            cars[carCounter] = car;
            carCounter++;
        } else {
            System.out.println("Garage is full or" + "car is null !!!");
        }
    }


    @Override
    public String toString() {
        String text = "";
        for (int i = 0; i < carCounter; i++) {
            text += cars[i] + "\n";
        }

        return text;
    }

    public Car getMostExpensiveCar() {
        Car mostExpensive = null;
        if (0 < carCounter) {
            mostExpensive = cars[0];

            for (int i = 1; 1 < carCounter; i++) {
                if (mostExpensive.getPricePaid() <
                        cars[i].getPricePaid()) {
                    mostExpensive = cars[i];
                }
            }
        }
        return mostExpensive;

    }
}