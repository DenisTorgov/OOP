package org.example;
import java.util.ArrayList;
public class Basket{
    protected ArrayList<String> items;
    protected Basket() {
        this.items = new ArrayList<>();
    }
    public ArrayList<String> getItems() {
        return this.items;
    }
    public void copyItems(ArrayList<String> item) {
        this.items = (ArrayList<String>) item.clone();
    }
    public void print(ArrayList<String> items) {
        for (int i = 0; i < this.items.size(); i++) {
            System.out.print(this.items.get(i) + ",");
        }
    }
}
