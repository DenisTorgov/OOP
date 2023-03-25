package org.example;

import java.util.ArrayList;

public class User extends Basket{
    protected String login;
    protected String password;
    protected User() {   }
    protected User(String login) {
        this.login = login;
    }
    public void NewUser(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public String getLogin() {
        return this.login;
    }

}
