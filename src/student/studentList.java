package student;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brand
 */
public class studentList {
    
public static void main(String[] args) {
Student[] studentList = new Student[3];
studentList[0] = new Student ("s1","Ronak Sheth");
studentList[1] = new Student ("s2","John Doe");
studentList[2] = new Student ("s3","Abc");

    for (Student studentList1 : studentList) {
        System.out.print(studentList1.getStudentId());
        System.out.print(" ");
        System.out.println(studentList1.getStudentName());
    }
}

}
    

