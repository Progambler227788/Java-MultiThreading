package org.example;

public class Talha extends Thread{
    @Override
    public  void run() {
        for(int i =0; i<1000; i+=1){
            System.out.println("World");
        }
    }


}
