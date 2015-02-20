/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.system;

import scholarship.system.Scholarship;
import university.system.interfaces.IStudent;

/**
 *
 * @author Adam
 */
public class Student implements IStudent{
  private String name;
  private byte age;
  private String id;
  private double average;
  private byte failedCourses;
  private double careerPorcentaje;
  private Scholarship scholarship;
  
  public Student(){};
  
  public Student(String name, byte age, String id, double average, byte failedCourses,
                 double careerPorcentaje)
  {
    this.name = name;
    this.age = age;
    this.id = id;
    this.average = average;
    this.failedCourses = failedCourses;
    this.careerPorcentaje = careerPorcentaje;
  }
  
  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the age
   */
  public Byte getAge() {
    return age;
  }

  /**
   * @param age the age to set
   */
  public void setAge(Byte age) {
    this.age = age;
  }

  /**
   * @return the average
   */
  @Override
  public double getAverage() {
    return average;
  }

  /**
   * @param average the average to set
   */
  @Override
  public void setAverage(double average) {
    this.average = average;
  }

  /**
   * @return the failedCourses
   */
  @Override
  public byte getFailedCourses() {
    return failedCourses;
  }

  /**
   * @param failedCourses the failedCourses to set
   */
  @Override
  public void setFailedCourses(byte failedCourses) {
    this.failedCourses = failedCourses;
  }

  /**
   * @return the careerPorcentaje
   */
  @Override
  public double getCareerPorcentaje() {
    return careerPorcentaje;
  }

  /**
   * @param careerPorcentaje the careerPorcentaje to set
   */
  @Override
  public void setCareerPorcentaje(double careerPorcentaje) {
    this.careerPorcentaje = careerPorcentaje;
  }

  /**
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * @return the scholarship
   */
  @Override
  public Scholarship getScholarship() {
    return scholarship;
  }

  /**
   * @param scholarship the scholarship to set
   */
  @Override
  public void setScholarship(Scholarship scholarship) {
    this.scholarship = scholarship;
  }
  
  
}
