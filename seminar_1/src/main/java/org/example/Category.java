package org.example;

import java.util.LinkedList;

public class Category {
    protected String catname;
    protected static String[] toys_list = {"wooden horse", "cubes", "paints",
                            "puzzle", "railroad", "doll Barbie", "doll Ken",
                            "comics", "blaster", "car", "light saber", "skate"};
    protected static String[] tools_list = {"wrench", "hammer", "screwdriver",
                            "tape measure", "pliers", "spirit level", "ladder",
                            "handsaw", "drill", "file", "putty knife", "plunger"};
    public Category() {}
//    public Category(String catname, String name, double price, double rating) {
//        this.catname = catname;
//        String name = "some";
//        double price = 1.0;
//        double rating = 1.0;
//    }
    public Category(String catname) {
        this.catname = catname;
    }
    public void setCategoryName(String catname) {
        this.catname = catname;
    }
    public String getCatName() { return this.catname;}
}
