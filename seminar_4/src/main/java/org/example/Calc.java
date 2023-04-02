package org.example;

import java.util.Random;

public class Calc<T extends Number> {
    private T item;

    public Calc (T item) {
        this.item = item;
    }
    public T setNumb(T item) {
        this.item = item;
        return item;
    }
    public Double sum (T n1, T n2) {
        Double num = n1.doubleValue() + n2.doubleValue();
        return num;
    }

}
