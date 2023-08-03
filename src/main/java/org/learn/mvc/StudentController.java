package org.learn.mvc;

public class StudentController {
    private Student student;
    private StudentView studentView;

    public StudentController(Student student, StudentView studentView) {
        this.student = student;
        this.studentView = studentView;
    }

    public String getStudentName() {
        return this.student.getName();
    }

    public void setStudentName(String name) {
        this.student.setName(name);
    }

    public String getStudentRollNo() {
        return this.student.getRollNo();
    }

    public void setStudentRollNo(String studentRollNo) {
        this.student.setRollNo(studentRollNo);
    }

    public void updateView() {
        this.studentView.printStudentDetail(this.student.getName(), this.student.getRollNo());
    }
}
