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
public class TareaHoroscopo {
    String signoZoodiacal = "";
    
    public void PedirSigno (){
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese signo zodiacal");
        signoZoodiacal = teclado.nextLine(); 
    }
 public void procesarDatos(){
    signoZoodiacal = signoZoodiacal.trim();
    signoZoodiacal = signoZoodiacal.toLowerCase();
}
 public void mostrarMensaje (){
     System.err.println("tu signo de hororscopo es ");
     
     switch (signoZoodiacal){
         case "aries":
             System.out.println("te saldra oportunidad ");
             break;
     
         case "piscis":
             System.out.println("te llamaran al telefono ");
             break;
     
         case "tauro":
             System.out.println("encontraras dinero ");
             break;
         default:
             System.out.println("te saldra oportunidad ");
     
         
         
     }
 }
}
