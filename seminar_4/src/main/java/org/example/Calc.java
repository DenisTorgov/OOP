package org.example;

import java.util.*;

public class Calc<T extends Number> {
    private T item;

    public Calc (T item) {
        this.item = item;
    }
    public T setNumb(T item) {
        this.item = item;
        return item;
    }
    public double doubleValue() {
        return item.doubleValue();
    }
    public Double sum (Calc num2) {
        Double num = this.item.doubleValue() + num2.doubleValue();
        return num;
    }
    public Double mult (Calc num2) {
        Double num = this.item.doubleValue() * num2.doubleValue();
        return num;
    }
    public List BinaryNumb () {
        List<Integer> bin = new ArrayList<>();
        List<Integer> reversebin = new ArrayList<>();
        int numb = this.item.intValue();
        while ( numb > 0) {
            bin.add(numb % 2);
            numb /= 2;
        }
        for (int j = 0; j < bin.size() ; j++) {
            reversebin.add(bin.get(bin.size() - j - 1)) ;
        }
        return reversebin;
    }
}
