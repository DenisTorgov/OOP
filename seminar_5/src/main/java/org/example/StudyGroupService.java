package org.example;

import java.util.List;

public class StudyGroupService {

    public static List<User> StudyGroupAddTeacher (Teacher t, List<User> sg) {
        sg.add(t);
        return sg;
    }
}
