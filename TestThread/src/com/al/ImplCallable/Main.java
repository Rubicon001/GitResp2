package com.al.ImplCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RandomThread ra = new RandomThread();
        FutureTask ft = new FutureTask(ra);
        Thread th = new Thread(ft, "RandomThread");
        th.start();
        System.out.println(th.getName() + "___" + ft.get());
       
    }
}
