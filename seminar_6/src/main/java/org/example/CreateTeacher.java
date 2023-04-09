package org.example;

import java.util.List;

public class CreateTeacher{
    public static Teacher CreateTeacher(List sl) {
        Teacher t = new Teacher(
                "Teach_name " + ((int) sl.size() + 1),
                "surname " + ((int) sl.size() + 1),
                sl.size() + 1);
        return t;
    }
    public static Teacher CreateVIPTeacher(List sl) {
        Teacher t = new Teacher(
                "VIPTeach_name " + ((int) sl.size() + 1),
                "VIPsurname " + ((int) sl.size() + 1),
                sl.size() + 1);
        return t;
    }
}
