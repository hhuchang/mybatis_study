package com.c2.plugins;

public class AshenServiceImpl implements AshenService {
    @Override
    public void service(String name) {
        System.out.println("hello "+name);
    }
}
