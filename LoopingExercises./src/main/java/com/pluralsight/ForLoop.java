package com.pluralsight;

public class ForLoop {
    public static void main(String[] args){

        int i;

        for (i = 10; i >= 1; i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (java.lang.Exception e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Launch!");
    }
}
