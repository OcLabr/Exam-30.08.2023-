package org.example.task1;

public class Thread1 implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " Thread name " + Thread.currentThread().getName());
        }
    }
}