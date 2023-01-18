package com.mjc.stage2;

public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;

    public ThreadSafeSingleton(){
    }

    public static synchronized ThreadSafeSingleton getInstance(){
        if (instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
