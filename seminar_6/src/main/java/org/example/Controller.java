package org.example;

/** Single responsibility principle контроллер направляет
 все вызовы к соответствующему классу
 */


import java.util.List;

public class Controller {
    public static List<User> CreateStudentsList () {
        List<User> study_group = CreateList.CreateStudentsList();
        return study_group;
    }
    public static List<User> CreateVIPStudentsList() {
        List<User> VIPstudy_group = CreateList.CreateVIPStudentsList();
        return VIPstudy_group;
    }
    public static Teacher CreateTeacher(List sl) {
        Teacher t = CreateTeacher.CreateTeacher(sl);
        return t;
    }
    public static Teacher CreateVIPTeacher(List sl) {
        Teacher VIPt = CreateTeacher.CreateVIPTeacher(sl);
        return VIPt;
    }
    public static void ShowGroup(List<User> sg) {
        View.ShowGroup(sg);
    }


}
