package com.al.creatation.factroy.factorymethod;

public class VanCar extends AbstractCar {
    public VanCar() {
        this.engine = "货车引擎";
    }

    @Override
    public void run() {
        System.out.println(engine + "-》哒哒哒。。。");
    }
}
