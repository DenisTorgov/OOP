package org.example;

import java.util.List;

public class View {
    public static void ShowGroup (List<User> sg) {
        for (User item: sg) {
            System.out.println(item.ID + " | " + item.name + " | " + item.surname + " | ");
        }
    }
}
