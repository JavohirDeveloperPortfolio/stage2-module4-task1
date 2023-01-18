package com.mjc.stage2;

public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){
    }

    private static ThreadSafeSingleton threadSafeSingleton(){
        if (instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    public ThreadSafeSingleton getInstance(){
        return instance;
    }
}
