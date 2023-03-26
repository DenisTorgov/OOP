package org.example;

public abstract class BaseClass {
    protected String name;
    public static int count;
    static { count = 0; }
    public BaseClass() {
        count++;
    }
    public BaseClass(String name) {
        this.name = name;
        count++;
    }
    public void Jump() {
        System.out.println("jump");
    }
    public void Run() {
        System.out.println("Run");
    }
}
