package org.example;

public class Robot extends BaseClass{
    public static int active;
    static { active = 1;}
    public Robot(String name) {
        super(name);
        System.out.println("Hello, I'm " + name);
    }
    @Override
    public double Jump() {
        System.out.println(this.name + "jump on 2m");
        return 2.0;
    }
    @Override
    public double Run() {
        System.out.println(this.name + "jump on 1m");
        return 20.0;
    }
}
