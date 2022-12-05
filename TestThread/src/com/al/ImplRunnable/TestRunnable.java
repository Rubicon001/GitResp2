package com.al.ImplRunnable;

public class TestRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "__" + i);
        }
    }
}
