package org.learn.transfer_object;

import java.util.ArrayList;
import java.util.List;

public class StudentBo {
    List<StudentVo> students;

    public StudentBo() {
        students = new ArrayList<>();
        StudentVo studentVo1 = new StudentVo("Tom", 0);
        StudentVo studentVo2 = new StudentVo("Jack", 1);
        students.add(studentVo1);
        students.add(studentVo2);
    }

    public List<StudentVo> getAllStudent() {
        return students;
    }

    public StudentVo getStudent(int rollNo) {
        return students.get(rollNo);
    }

    public void updateStudent(StudentVo studentVo) {
        students.get(studentVo.getRollNo()).setName("Judy");
        System.out.println("Student: Roll No: " + studentVo.getRollNo() + " ,updated in database");
    }

    public void deleteStudent(StudentVo studentVo) {
        students.remove(studentVo.getRollNo());
        System.out.println("Student: Roll No: " + studentVo.getRollNo() + " ,deleted in database");
    }
}
