/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author brand
 */
public class partTimeStudent extends Student{
    
    private int numCourses;
    
    public partTimeStudent(String studentId, String studentName, int numCourse){
        super(studentId, studentName);
            this.numCourses=numCourse;
    }
    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
    
    
}
