package org.example;

/** Single responsibility principle контроллер направляет
 все вызовы к соответствующему классу
 */

import java.util.ArrayList;
import java.util.List;

public class Controller {
//    public static List<User> CreateStudentsList () {
//        List<User> study_group = (List<User>) new CreateStudentsList();
//        return study_group;
//    }

    public static List<User> CreateStudentsList () {
        List<User> study_group = CreateStudentsList.CreateList();
        return study_group;
    }
    public static Teacher CreateTeacher(List sl) {
        Teacher t = CreateTeacher.CreateTeacher(sl);
        return t;
    }

    public static void ShowGroup(List<User> sg) {
        View.ShowGroup(sg);
    }
}
