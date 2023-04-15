package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

public class View {

    public static void Welcome() {
        System.out.println("Калькулятор запущен");
        Execute();
    }
    public static void Execute () {
        System.out.println("Список возможных действий:");
        System.out.println("1 Сложить два числа");
        System.out.println("2 Умножить два числа");
        System.out.println("3 Разделить два числа");
        System.out.println("4 Сложить два комплексных числа");
        System.out.println("5 Умножить два комплексных числа");
        System.out.println("6 Разделить два комплексных числа");
        System.out.println("0 Выход");
        int action = Integer.parseInt(UserInput(""));
        Action(action);
    }
    public static void ShowResult(OperationsList res) {
        System.out.println(res.getResult());
    }
    private static String UserInput (String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        return sc.nextLine();
    }
    private static void Action (int action) {
        Operation res = new Operation();
        ComlexOperation cres = new ComlexOperation();
        Log log = new MyLogger();
        switch (action) {
            case 1:
                log.LogIt(res.Sum(5.0, 2.0));
                ShowResult(res);
                Execute();
                break;
            case 2:
                log.LogIt(res.Mult(5.0, 2.0));
                ShowResult(res);
                Execute();
                break;
            case 3:
                log.LogIt(res.Div(5.0, 2.0));
                ShowResult(res);
                Execute();
                break;
            case 4:
                log.LogIt(cres.ComplSum(res.Sum(5.0, 2.0), res.Sum(7.0, -8.0)));
                ShowResult(cres);
                Execute();
                break;
            case 5:
                log.LogIt(cres.ComplMult(5.0, 2.0, 7.0, -1.0));
                ShowResult(cres);
                Execute();
                break;
            case 6:
                log.LogIt(cres.ComplDiv(5.0, 2.0, 7.0, -1.0));
                ShowResult(cres);
                Execute();
                break;
            case 0:
                break;
        }

    }
}
