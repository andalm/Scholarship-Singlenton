/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.system;

import java.util.ArrayList;
import scholarship.system.Scholarship;

/**
 *
 * @author Adam
 */
public class University {
  private ArrayList<Student> students = new ArrayList<>();
  private static final double minAverage = 4.5;
  private static final byte maxFailedCourses = 2;
  private static final double minCareerPorcentaje = 60;
  
  public void getScholarships()
  {
    for(Student student:students)
    {
      if(!validateStudent(student))
        continue;      
      student.setScholarship(Scholarship.get(student));
    }
  }

  /**
   * @param index
   * @return return the index student
   */
  public Student getStudent(int index) {
    return students.get(index);
  }

  /**
   * @param student the students to set
   */
  public void setStudent(Student student) {
    this.students.add(student);
  }
  
  public boolean validateStudent(Student student)
  {
    return minAverage <= student.getAverage() && maxFailedCourses >= student.getFailedCourses()
            && minCareerPorcentaje <= student.getCareerPorcentaje();
  }
}
