package com.c2.Generic;

public class Test {
    public static void main(String[] args) {
        Generic<Integer> gInteger =new Generic<>(123);
        show(gInteger);
        Generic<Number> gNumber=new Generic<>(456);
        show(gNumber);
    }

    public static void show(Generic<?> obj){
        System.out.println(obj.getKey());
    }
}
