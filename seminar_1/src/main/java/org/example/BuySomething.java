package org.example;

import java.util.ArrayList;
import java.util.Random;

public class BuySomething {
    public static ArrayList<String> Buy () {

        ArrayList<String> items = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int randomlist = random.nextInt(2);
            if (randomlist == 0) {
                int x = random.nextInt(11);
                String item = Category.toys_list[x];
                System.out.print(item + ",");
                items.add(item);
            }
            if (randomlist == 1) {
                int x = random.nextInt(11);
                String item = Category.tools_list[x];
                System.out.print(item + ",");
                items.add(item);
            }
        }
        System.out.println(items);
        return items;
    }
    public static ArrayList<String> DeleteItem (ArrayList<String> purcase, ArrayList<String> warehouse) {
        for (int i = 0; i < purcase.size(); i++) {
            if (warehouse.indexOf(purcase.get(i)) > 0) {
                warehouse.remove(warehouse.indexOf(purcase.get(i)));
            }
        }
        return warehouse;
    }
}
