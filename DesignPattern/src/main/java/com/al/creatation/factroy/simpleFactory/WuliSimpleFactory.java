package com.al.creatation.factroy.simpleFactory;


/**
 * 1. 简单工厂
 * 2. 产品极少
 * 3. 如果想造更多的产品就只能不断的判断，违背了开闭原则
 */
public class WuliSimpleFactory {
    public AbstractCar newCar(String type) {
        if (type.equals("van")) {
            return new VanCar();
        } else if (type.equals("mini")) {
            return new MiniCar();
        }
        return null;
    }
}
