/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholarship.system;

import university.system.*;
/**
 *
 * @author Adam
 */
public class Scholarship {
  private static byte maxScholarships = 9;
  private static final double minAverage = 4.5;
  private static final byte maxFailedCourses = 2;
  private static final double minCareerPorcentaje = 60;
  
  private Scholarship(){};
  
  public static Scholarship get(Student student)
  {
    if(validateStudent(student))
    {
      maxScholarships--;
      return new Scholarship();
    }  
    return null;
  }
  
  public static boolean validateStudent(Student student)
  {
    if(maxScholarships >= 1)
    {
      if( minAverage <= student.getAverage() && maxFailedCourses >= student.getFailedCourses()
          && minCareerPorcentaje <= student.getCareerPorcentaje() )
      {
        return true;
      }      
    }
    
    return false;
  }
}
