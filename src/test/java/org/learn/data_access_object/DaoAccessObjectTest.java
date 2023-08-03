package org.learn.data_access_object;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DaoAccessObjectTest {
    @Test
    @DisplayName("dao test")
    public void daoTest() {
        StudentDao studentDao = new StudentDaoImpl();
        for (Student s : studentDao.getAllStudent()) {
            System.out.println("Student [RollNo: " + s.getRollNo() + ",Name: " + s.getName() + "]");
        }
        System.out.println("****************");

        var stu1 = studentDao.getStudent(0);
        System.out.println("Student [RollNo: " + stu1.getRollNo() + ",Name: " + stu1.getName() + "]");
        System.out.println("**************");

        studentDao.updateStudent(new Student("David", 0));
        studentDao.deleteStudent(new Student("Jack",1));
    }
}
