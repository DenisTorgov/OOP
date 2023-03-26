package org.example;

public abstract class BaseClass {
    public int active = 1;
    protected String name;
    public static int count;
    static { count = 0;}
    public BaseClass() {
        count++;
    }
    public BaseClass(String name) {
        this.name = name;
        count++;
    }
    public double Jump() {
        System.out.println("jump");
        return 0.0;
    }
    public double Run() {
        System.out.println("Run");
        return 0.0;
    }
}
