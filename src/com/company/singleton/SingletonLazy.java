package com.company.singleton;

public final class SingletonLazy {
    private static SingletonLazy singleton;

    private SingletonLazy() {
    }

    public static synchronized SingletonLazy getSingleInstance() {
        if (singleton == null) {
            singleton = new SingletonLazy();
        }
        return singleton;
    }
}
