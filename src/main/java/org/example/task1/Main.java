package org.example.task1;

public class Main {
    public static void main(String[] args) {
        Thread1 numberCounter = new Thread1();
        Thread2 abc = new Thread2();
        Thread thread1 = new Thread(numberCounter, "thread1");
        Thread thread2 = new Thread(abc, "thread2");
        thread1.start();
        thread2.start();
    }
}