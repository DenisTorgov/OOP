package org.example;

public class Cat extends BaseClass{
    public static int active;
    static { active = 1;}

    public Cat(String name) {
        super(name);
        System.out.println("Meow " + name);
    }
    @Override
    public double Jump() {
        System.out.println(this.name + "jump on 1.5m");
        return 1.5;
    }
    @Override
    public double Run() {
        System.out.println(this.name + "jump on 1.5m");
        return 10.0;
    }
}
