package org.example;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> warehouse_toys_list = new ArrayList<> (Arrays.asList(
                                "wooden horse", "cubes", "paints", "puzzle",
                                "railroad", "doll Barbie", "doll Ken",
                                "comics", "blaster", "car", "light saber", "skate"));
        ArrayList<String> warehouse_tools_list = new ArrayList<> (Arrays.asList(
                                "wrench", "hammer", "screwdriver", "tape measure",
                                "pliers", "spirit level", "ladder",
                                "handsaw", "drill", "file", "putty knife", "plunger"));
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
        ArrayList<String> a = BuySomething.Buy();
        user1.copyItems(a);
        warehouse_toys_list = BuySomething.DeleteItem(a, warehouse_toys_list);
        warehouse_tools_list = BuySomething.DeleteItem(a, warehouse_tools_list);
        System.out.println(user1.login + " купил " + user1.getItems());
        System.out.println("На складе осталось \n" + warehouse_toys_list + "\n" + warehouse_tools_list);
        User user2 =  new User("Маша Пупкина");
        a = BuySomething.Buy();
        user2.copyItems(a);
        warehouse_toys_list = BuySomething.DeleteItem(a, warehouse_toys_list);
        warehouse_tools_list = BuySomething.DeleteItem(a, warehouse_tools_list);
        System.out.println();
        System.out.println(user2.login + " купил " + user2.getItems());
        System.out.println("На складе осталось \n" + warehouse_toys_list +"\n"+ warehouse_tools_list);
        System.out.println();

    }
}