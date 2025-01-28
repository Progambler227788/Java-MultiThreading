package org.example;

public class Main {


    public static void main(String[] args) {

        System.out.println("Hello world!");

//        System.out.println(Thread.currentThread().getName());

        Talha a = new Talha(); // created thread , NEW state (lifecycle step)


        a.start(); // Runnable state

        // a thread is blocked and waiting BLOCKED/WAITING

        // TERMINATED a thread finished


    }

}