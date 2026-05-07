package com.demos;

public class Laptop implements Computer {
    public Laptop(){
        System.out.println("laptop contructor");
    }

   public void compile(){
        System.out.println("laptop compile");
    }
}
