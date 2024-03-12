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
public class EstratoEmpleado {
    int estrato;
    public void pedirEstrato(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese estrato: ");
         estrato= teclado.nextInt();
    }
String Ciudad,nombreCompleto;
float Estatura;
double Distancia;
public void PedirCiudad(){
    Scanner teclado = new Scanner(System.in);
    System.out.println("escribe la ciudad : ");
    Ciudad = teclado.next();
    System.out.println("escribe la estatura : ");
    Estatura = teclado.nextFloat();
    System.out.println("ingrese distacia : ");
    Distancia = teclado.nextDouble();
    System.out.println("ingrese distancia : ");
    nombreCompleto = teclado.nextLine();
       
}
}