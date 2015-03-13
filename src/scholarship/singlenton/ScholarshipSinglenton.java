/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholarship.singlenton;

import java.util.Random;
import university.system.Student;
import university.system.University;

/**
 *
 * @author Adam
 */
public class ScholarshipSinglenton {
  
  private static University university = new University();
  private static int maxStudents = 300;
  
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) 
  {    
    setStudents();
    university.getScholarships();
    for(int i=0; i<maxStudents; i++)
    {
      if(university.getStudent(i).getScholarship() != null)
      {
        System.out.println(university.getStudent(i).getName() + " has a scholarship");
      }
      else
      {
        System.out.println(university.getStudent(i).getName() + " has not scholarship");
      }
    }
  }
  
  public static void setStudents()
  {
    Random  a = new Random();
    Student student;
    for(int i=0; i<maxStudents; i++)
    {
      student = new Student(
        "Student " + (i+1), 
        (byte)(a.nextInt(40-18)+1),
        "123", (a.nextFloat()*5), 
        (byte)(a.nextInt(3)+1),
        (a.nextFloat()*(100-10)+10)
      );
      university.setStudent(student);
    }
  }
  
}
