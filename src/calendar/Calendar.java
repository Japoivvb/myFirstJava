/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calendar;
/**
 *
 * @author AdministradorCIFO
 */
public class Calendar {    

    /**
     * 
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("starting application");

        // get current year
        // architecture layer
        Utility object = new Utility();      
        String currentYear = object.getCurrentYear();

        // business layer
        System.out.println("We are in year: " + currentYear);
        
        if (Integer.parseInt(currentYear) > Utility.XX_CENTURY) {
            System.out.println("This is XXI century, your new tax income will be 100");
            
        } else {
            System.out.println("This is XX century, your new tax income will be 50");
        }

    }
}
