/** Задание
 Взять реализованный код в рамках последнего семинара (5)
 и продемонстрировать применение принципов,
 усвоенных на семинаре. Нужно в проекте прокомментировать
 участки кода, которые рефакторим, какой принцип применяем и почему
*/


package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> studentslist = Controller.CreateStudentsList();
        Teacher teacher = Controller.CreateTeacher (studentslist);
        List<User> sg = StudyGroupService.StudyGroupAddTeacher (teacher, studentslist);
        Controller.ShowGroup(sg);

    }
}