package org.example;

public class Main {
    public static void main(String[] args) {
        NumberCounter numberCounter = new NumberCounter();
        Thread thread1 = new Thread(numberCounter(1,50), "thread1");
        Thread thread2 = new Thread(numberCounter, "thread2");
        Thread thread3 = new Thread(numberCounter, "thread3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}