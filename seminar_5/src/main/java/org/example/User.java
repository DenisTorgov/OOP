package org.example;

public abstract class User {
    String name;
    String surname;
    int ID;

    public User() {

    }

    public User(String name, String surname, int ID) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
    }
}
