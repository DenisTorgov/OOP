package org.example;

public class Human extends BaseClass{
    public static int active;
    static { active = 1;}
    public Human(String name) {
        super(name);
        System.out.println("Hello, I'm " + name);
    }
    @Override
    public double Jump() {
        System.out.println(this.name + "jump on 1m");
        return 1.0;
    }
    @Override
    public double Run() {
        System.out.println(this.name + "jump on 1m");
        return 8.0;
    }
}
