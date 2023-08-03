package org.learn.transfer_object;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TransferObjectTest {
    @Test
    @DisplayName("Transfer object test")
    public void studentBOTest() {
        StudentBo studentBo = new StudentBo();
        for (StudentVo vo : studentBo.students) {
            System.out.println(vo.getName() + " -- " + vo.getRollNo());
        }
        System.out.println("***********");
        var stu = studentBo.getStudent(0);
        System.out.println(stu.getName() + " --- " + stu.getRollNo());
        System.out.println("**********");
        StudentVo s1 = new StudentVo("donny", 0);
        studentBo.updateStudent(s1);
        System.out.println(s1.getName() + " *** " + stu.getRollNo());
        System.out.println("**********");
        studentBo.deleteStudent(new StudentVo("Jack", 1));
    }
}
