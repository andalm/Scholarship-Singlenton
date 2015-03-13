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
  
  private Scholarship(){};
  
  public static Scholarship get()
  {
    if(maxScholarships >= 1)
    {
      maxScholarships--;
      return new Scholarship();
    }  
    return null;
  } 
}
