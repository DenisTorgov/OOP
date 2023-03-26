/**Домашнее задание на закрепление :

        1)Создайте три класса: Человек, Кот, Робот, которые наследуются от одного класса.
        Эти классы должны уметь бегать и прыгать, все также с выводом информации о действии в консоль.
        2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
        должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
        печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
        (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
        3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
        этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
        списку он препятствий не идет.
*/

package org.example;
import org.example.BaseClass;
import org.example.Robot;
import org.example.Cat;
import org.example.Human;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BaseClass[] party = {
                new Human("Mike"),new Cat("Kitty"), new Robot("Mr. Robot")
        };
        System.out.println("Party ready" + BaseClass.count);
        for (int i = 0; i < party.length; i++) {
            party[i].Jump();

        }
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            if (random.nextInt(2) == 1) {
                party[0].Jump();
            } else {
                party[0].Run();
            }
        }
    }
}