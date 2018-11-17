/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Empleado {
    
    public Empleado(String nom, String ap, int ed){
        
        this.nombre=nom;
        this.apellido=ap;
        this.edad=ed;
    }
  

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }
    
    private String nombre;
    private String apellido;
    private int edad;
}
