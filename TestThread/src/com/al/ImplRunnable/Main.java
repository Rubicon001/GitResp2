package com.al.ImplRunnable;

public class Main {
    public static void main(String[] args) {
        TestRunnable tr = new TestRunnable();
        Thread t = new Thread(tr, "子线程！");
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "__" + i);
        }
    }
}
