package com.designpatterns.singletondesginpattern;

public class SingletonDesignPattern {

    public static void main(String[] args) {
        System.out.println(SingletonDesignPattern.getSingletonDesignPattern());
        System.out.println(SingletonDesignPattern.getSingletonDesignPattern());
        Thread thread1 = new Thread() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(SingletonDesignPattern.getSingletonDesignPattern());

                }
            }
        };
        thread1.start();

        Thread thread2 = new Thread() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(SingletonDesignPattern.getSingletonDesignPattern());

                }
            }
        };
        thread2.start();
    }

    private volatile static SingletonDesignPattern singletonDesignPattern = null;

    private SingletonDesignPattern() {
    }
    
    public static SingletonDesignPattern getSingletonDesignPattern() {

        if (singletonDesignPattern == null) {
            synchronized (SingletonDesignPattern.class) {
                if (singletonDesignPattern == null) {
                    singletonDesignPattern = new SingletonDesignPattern();
                }
            }
        }
        return singletonDesignPattern;
    }


}
