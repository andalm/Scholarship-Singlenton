/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.system.interfaces;

import scholarship.system.Scholarship;

/**
 *
 * @author Adam
 */
public interface IStudent {
  public double getAverage();
  public void setAverage(double average);
  public byte getFailedCourses();
  public void setFailedCourses(byte failedCourses);
  public double getCareerPorcentaje();
  public void setCareerPorcentaje(double careerPorcentaje);
  public Scholarship getScholarship();
  public void setScholarship(Scholarship scholarship);
}
