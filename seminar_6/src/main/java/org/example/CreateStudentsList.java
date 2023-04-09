package org.example;

import java.util.ArrayList;
import java.util.List;

public class CreateStudentsList {
    public static List<User> CreateList () {
        List<User> study_group = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            study_group.add(new Student("Stud_name " + i, "surname " + i, i));
        }
        return study_group;
    }
}
