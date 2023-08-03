package org.learn.mvc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MvcTest {
    @Test
    @DisplayName("mvc test")
    public void controllerTest() {
        Student student = getStudentFromDatabase();
        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(student, studentView);
        studentController.updateView();
        System.out.println("***** update model *****");
        studentController.setStudentName("Jack");
        studentController.updateView();
    }

    private Student getStudentFromDatabase() {
        Student student = new Student();
        student.setName("Tom");
        student.setRollNo("123");
        return student;
    }
}
