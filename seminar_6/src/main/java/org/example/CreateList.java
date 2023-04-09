package org.example;

/** Open-closed principle
 Класс можно расширить с новым функционалом
 */

import java.util.ArrayList;
import java.util.List;

public class CreateList{
    public static List<User> CreateStudentsList() {
        List<User> study_group = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            study_group.add(new Student("Stud_name " + i, "surname " + i, i));
        }
        return study_group;
    }

    public static List<User> CreateVIPStudentsList() {
        List<User> study_group = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            study_group.add(new Student("VIPStud_name " + i, "VIPsurname " + i, i));
        }
        return study_group;
    }
}
