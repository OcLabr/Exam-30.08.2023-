package org.example.task1;

public class Abc implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 51; i <= 100; i++) {
            System.out.println(i + "Thread name " + Thread.currentThread().getName());
        }
    }
}