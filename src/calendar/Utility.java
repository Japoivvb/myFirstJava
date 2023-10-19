/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calendar;

import java.time.LocalDate;

/**
 *
 * @author AdministradorCIFO
 */
public class Utility {
    public final String CURRENT_CENTURY = "19";
    public final static int XX_CENTURY = 2000;
    
    
     public String getCurrentYear() {        
        // TODO code application logic here
        //System.out.println("in method");
        int currentYear = 0;
        currentYear = LocalDate.now().getYear();
        String year = Integer.toString(currentYear);
        return year;        
    }
    
}
