package com.demos;

public class Dev {
    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    private Computer comp;


   // private Laptop laptop;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //private Laptop laptop;
    private int age;

    public Dev(int age){
        this.age = age;
        System.out.println("dev1 constructor");
    }

    public Dev(){
        System.out.println("dev contructor");
    }

    public void build(){

        System.out.println("Workign on spring without boot");
    }

    public void setLaptop(Laptop laptop) {
    }
}
