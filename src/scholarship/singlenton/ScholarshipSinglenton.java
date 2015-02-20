/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholarship.singlenton;

import scholarship.system.Scholarship;
import university.system.Student;
import university.system.University;

/**
 *
 * @author Adam
 */
public class ScholarshipSinglenton {
  
  private static University university = new University();
  private static int maxStudents = 20;
  
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) 
  {    
    setStudents();
  }
  
  public static void setStudents()
  {
    int students = (int) (Math.random() * maxStudents);
    Student student;
    for(int i=0; i<students; i++)
    {
      student = new Student("Student " + i, (byte)Math.random(), "123", Math.random(), (byte)Math.random(),
                     (double)Math.random());
      university.setStudent(student);
    }
  }
  
}
