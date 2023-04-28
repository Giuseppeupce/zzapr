
package zzapr.Week05;

public class Week05Main {
    public static void main(String[] args){

        Car car01 = new Car("Fiat", "500", 10000, 105000);
        Car car02 = new Car("Ferrari", "Portofino", 100000, 11250);
        Car car03 = new Car("Mercedes", "Classe E AMG", 130000, 45000);
        Car car04 = new Car("Fiat", "Panda", 4500, 1000);
        Car car05 = new Car("Alfa Romeo", "Mito", 12000, 5500);

        Garage garage = new Garage();
        garage.addCarToGarage(car01);
        garage.addCarToGarage(car02);
        garage.addCarToGarage(car03);
        garage.addCarToGarage(car04);
        garage.addCarToGarage(car05);
        garage.sortCarByMileage();

        System.out.println("The available Cars sorted by mileage\n------------------------------------");
        System.out.println(garage);
        System.out.println("The most expensive Car is: " + garage.getMostExpensiveCar());

    }
}
