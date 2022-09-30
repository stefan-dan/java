package com.company.singleton;

public final class SingletonEager {
    private static final SingletonEager SINGLETON = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getSingleInstance() {
        return SINGLETON;
    }

    public static void main(String[] args) {
        SingletonEager eagerInstance = SingletonEager.getSingleInstance();
        System.out.println(eagerInstance);
        SingletonEager sameEagerInstance = SingletonEager.getSingleInstance();
        System.out.println(sameEagerInstance);

        SingletonLazy lazyInstance = SingletonLazy.getSingleInstance();
        System.out.println(lazyInstance);
        SingletonLazy sameInstance = SingletonLazy.getSingleInstance();
        System.out.println(sameInstance);

    }
}
