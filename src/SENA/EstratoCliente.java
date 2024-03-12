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
public class EstratoCliente {
    short Estrato;
    
    public void pedirEstrato(){
        Scanner teclado = new Scanner(System.in);
        Estrato = teclado.nextShort();  
}
    public void ClasificarEstrato () {
        if (Estrato <3) {
            System.out.println("Estrato bajo");
            
       }else{
            System.out.println("estrato alto");
        }
}
    public void Ejecuta (){
        pedirEstrato();
        ClasificarEstrato();
    }
    
}
