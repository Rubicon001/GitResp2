package com.al.ImplCallable;

import java.util.Random;
import java.util.concurrent.Callable;

public class RandomThread implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println(new Random().nextInt(100));
        return 0;
    }
}
