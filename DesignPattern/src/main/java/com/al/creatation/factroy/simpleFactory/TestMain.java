package com.al.creatation.factroy.simpleFactory;


public class TestMain {
    public static void main(String[] args) {
        WuliSimpleFactory factory = new WuliSimpleFactory();
        AbstractCar car1 = factory.newCar("van");
        AbstractCar car2 = factory.newCar("mini");
        AbstractCar car3 = factory.newCar("aa");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
