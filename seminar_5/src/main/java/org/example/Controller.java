package org.example;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public static List<User> CreateStudentsList () {
        List<User> study_group = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            study_group.add(new Student("Stud_name " + i, "surname " + i, i));
        }
        return study_group;
    }

    public static Teacher CreateTeacer(List sl) {
        Teacher t = new Teacher(
                "Teach_name " + ((int) sl.size() + 1),
                "surname " + ((int) sl.size() + 1),
                sl.size() + 1);
        return t;
    }

    public static void ShowGroup(List<User> sg) {
        View.ShowGroup(sg);
    }
}
