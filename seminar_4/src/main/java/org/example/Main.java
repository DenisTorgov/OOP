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
        Calc n1 = new Calc<>(random.nextInt(10));
        Calc n2 = new Calc<>(Math.ceil((random.nextInt(10) + random.nextDouble())*100)/100);
        System.out.printf("First %.2f | Second %.2f \n", n1.doubleValue(), n2.doubleValue());
        System.out.println("Sum result " + Math.ceil((n1.sum(n2))*100)/100);
        System.out.println("Mult result " + Math.ceil((n1.mult(n2))*100)/100);
        System.out.println("Binary int result " + n1.BinaryNumb());
        System.out.println("Binary double result " + n2.BinaryNumb());
    }
}