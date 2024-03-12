/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SENA;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class EstratoEstudiante {
    
    String[] nombreEstudiante = new String[71];
    int[] estratoEstudiante = new int[7];
    
    public void pedirNombreYEstrato(){
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < nombreEstudiante.length; i++){
        System.out.println(" escriba nombre");
        String unNombreEmpleado = teclado.next();
        System.out.println("ingrese el estracto");
        int unEstractoEmpleado = teclado.nextInt();
        nombreEstudiante[i] = unNombreEmpleado;
        estratoEstudiante [i]= unEstractoEmpleado; 
    }
       
    }
    public void MostrarEstudiantesTres() {
        pedirNombreYEstrato();
        for (int i = 0; i < estratoEstudiante.length; i++) {
            int elEStrato = estratoEstudiante [i];
            if (elEStrato == 3);{
                System.out.println("estudiante " + nombreEstudiante [i] + "es 3");
            
            
            
        }
}
     }
     }
     
