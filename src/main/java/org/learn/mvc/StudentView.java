package org.learn.mvc;

public class StudentView {
    public void printStudentDetail(String studentRollNo, String studentName) {
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("RollNo: " + studentRollNo);
    }
}
