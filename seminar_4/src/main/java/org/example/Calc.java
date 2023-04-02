package org.example;

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

//    public static Double sum (Calc n1, Calc n2) {
//        Double num = n1.toDouble() + n2.toDouble();
//        return num;
//    }


}
