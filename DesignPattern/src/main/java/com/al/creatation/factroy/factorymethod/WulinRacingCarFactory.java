package com.al.creatation.factroy.factorymethod;

/**
 * RacingCar分厂
 */
public class WulinRacingCarFactory extends AbstractCarFactory{
    @Override
    public AbstractCar newCar() {
        return new RacingCar();
    }
}
