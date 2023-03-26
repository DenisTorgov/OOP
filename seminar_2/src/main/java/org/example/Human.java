package org.example;

public class Human extends BaseClass{

    public Human(String name) {
        super(name);
        System.out.println("Hello, I'm " + name);
    }
    @Override
    public void Jump() {
        System.out.println(this.name + "jump on 1m");
    }

}
