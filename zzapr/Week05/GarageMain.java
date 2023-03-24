package zzapr.Week05;


    public class GarageMain {

        public static void main(String[] args) {
            Car car01 = new Car("Fiat", "500", 10000, 10500);


            Car car02 = new Car("Skoda", "Fabia", 8000, 30895);

            Garage garage01 = new Garage();
            garage01.addCarToGarage(car01);
            garage01.addCarToGarage(car02);

            System.out.println(garage01);

            System.out.println("The most expensive car is: " + garage01.getMostExpensiveCar());










        }
    }

