package com.al.creatation.factroy.simpleFactory;

public class MiniCar extends AbstractCar {
    public MiniCar() {
        this.engine = "轿车引擎";
    }

    @Override
    public void run() {
        System.out.println(engine + "->嘟嘟嘟....");
    }
}
