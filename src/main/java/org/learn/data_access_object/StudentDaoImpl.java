package org.learn.data_access_object;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private List<Student> list;

    public StudentDaoImpl() {
        list = new ArrayList<>();
        Student s1 = new Student("Tom", 0);
        Student s2 = new Student("Jack", 1);
        list.add(s1);
        list.add(s2);
    }

    @Override
    public List<Student> getAllStudent() {
        return list;
    }

    @Override
    public Student getStudent(int rollNo) {
        return list.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        list.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student [RollNo: " + student.getRollNo() + ",Name: " + student.getName() + "] ,updated in database");
    }

    @Override
    public void deleteStudent(Student student) {
        list.remove(student.getRollNo());
        System.out.println("Student [RollNo: " + student.getRollNo() + ",Name: " + student.getName() + "] ,deleted in database");
    }
}
