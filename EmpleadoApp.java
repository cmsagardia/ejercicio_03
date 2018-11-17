/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class EmpleadoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Empleado e1=new Empleado("Esteban", "Garro",29);
        Empleado e2=new Empleado("Jose", "Pablo",19);
        Empleado e3=new Empleado("Lucas", "Hernandez",29);  
        
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        
    }
    
}
