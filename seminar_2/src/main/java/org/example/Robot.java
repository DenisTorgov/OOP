package org.example;

public class Robot extends BaseClass{

    public Robot(String name) {
        super(name);
        System.out.println("Hello, I'm " + name);
    }
    @Override
    public void Jump() {
    System.out.println(this.name + "jump on 2m");
    }
}
