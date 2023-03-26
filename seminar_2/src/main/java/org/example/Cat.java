package org.example;

public class Cat extends BaseClass{

    public Cat(String name) {
        super(name);
        System.out.println("Meow " + name);
    }
    @Override
    public void Jump() {
        System.out.println(this.name + "jump on 1.5m");
    }
}
