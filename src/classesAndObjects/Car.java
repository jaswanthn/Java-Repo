package classesAndObjects;

public class Car {

    public static void main(String[] args) {
        Driver dr = new Driver();
        dr.drivingCar();
    }
}


class Driver {

    void drivingCar() {
        System.out.println("Driving the car");
    }
}