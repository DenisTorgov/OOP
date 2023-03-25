package org.example;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
//        String[] toys_list = {"wooden horse", "cubes", "paints", "puzzle",
//                                "railroad", "doll Barbie", "doll Ken",
//                                "comics", "blaster", "car", "light saber", "skate"};
//        String[] tools_list = {"wrench", "hammer", "screwdriver", "tape measure",
//                                "pliers", "spirit level", "ladder",
//                                "handsaw", "drill", "file", "putty knife", "plunger"};
        Category toys = new Category("toys");
        Category tools = new Category("tools");
        System.out.println(toys.catname);
        Goods atoy = new Goods();
        Goods btoy = new Goods("btoy", 346.7, 4.9);
        atoy.name = "atoy";
        atoy.price = 256.0;
        atoy.rating = 4.6;
        atoy.setName("atoy");
        System.out.println("jh");
        System.out.println(btoy.name);
        User user1 =  new User("Вася Ложкин");
        if (user1 instanceof User) {
            System.out.println("yes");
        }

//        user1.
//        new Basket();
//        Basket().addItems();
//        ArrayList<String> item = Basket().getItems();
//        ArrayList<String> = new (user1.Basket);
//
//        Basket user1_bask = new Basket();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int randomlist = random.nextInt(2);
            if (randomlist == 0) {
                int x = random.nextInt(11);
                String item = Category.toys_list[x];
                System.out.print(item + ",");
                user1.addItems(item);
            }
            if (randomlist == 1) {
                int x = random.nextInt(11);
                String item = Category.tools_list[x];
                System.out.print(item + ",");
                user1.addItems(item);
            }
        }
        System.out.println();
        user1.print(user1.getItems());


    }
}