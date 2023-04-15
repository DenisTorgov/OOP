package org.example;

public class Controller implements IController {

    @Override
    public Controller Start() {
        View.Welcome();
        return null;
    }
}
