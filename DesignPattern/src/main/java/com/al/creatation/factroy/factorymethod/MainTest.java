package com.al.creatation.factroy.factorymethod;

public class MainTest {

    public static void main(String[] args) {
        AbstractCarFactory factory = new WulinVanCarFactory();
        AbstractCar car = factory.newCar();
        car.run();

        AbstractCarFactory factory1 = new WulinRacingCarFactory();
        AbstractCar car1 = factory1.newCar();
        car1.run();


    }
}
