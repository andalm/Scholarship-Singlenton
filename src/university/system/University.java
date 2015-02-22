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
  
  public void getScholarships()
  {
    int count = students.size();
    for(int i=0; i<count; i++)
    {
      students.get(i).setScholarship(Scholarship.get(students.get(i)));
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
}
