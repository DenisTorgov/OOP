/** Актуальное дз:
        1)расширить класс калькулятор на умножение
        2)расширить класс калькулятор на деление
        3)расширить класс калькулятор на бинарный
        перевод(принимаемые значения как стринг,
        так и инт - тут необходимо подумать как
        наилучшим образом реализовать, что будет
        если будут приниматься округляемые Double/Float
        (округляемые -> с нулем на конце прим. 3.0 , 4.0 и тд т))
*/

package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Random random =new Random();
        Calc n1 = new Calc<>(random.nextInt());
        Calc n2 = new Calc<>(random.nextInt() + random.nextDouble());
        System.out.println("First " + n1 + "Second " + n2);
        System.out.println("Sum result " + Calc.sum(n1, n2));
    }
}