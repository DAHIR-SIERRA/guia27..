/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SENA;


/**
 *
 * @author User
 */
public class  AtributosYMetodos{
    String nombre =" rolan Deschain ";
    short edad = 16;
    int poblacion = 1_200_000;
    long enteroLargo = 200_045_320_202L;
    char vocal = 'a';
    float altura = 1_500_200_553f;
    double distancia = 194_000_200_230.0000494;
    boolean esNoche = false;
    
    
        public void mostrarVarible(){
            System.out.println("nombre:   " + nombre);
            System.out.println("nombre:   " + nombre);
            System.out.println("edad:   " + edad);
            System.out.println("poblacion :   " + poblacion);
            System.out.println("enteroLargo :   " + enteroLargo);
            System.out.println("voca l:  " + vocal);
            System.out.println("altura :   "  + altura );
            System.out.println("distancia :   " + distancia);
            System.out.println("esNoche :   " + esNoche);

        }
        public void DividirDosNmeros (){
            float numero = 200f;
            float valor = 12f;
            float resultado = numero / valor;
            System.out.println("resultado : " + resultado); 

        }
         public void MultiplicarDosNumeros(int cantidad, int precio){
            int total = precio * cantidad;
            System.out.println("el resultado es : " + total);
        }
         public int RestarDosNumeros(int cotizacion , int presupuesto ){
            int respuesta = cotizacion - presupuesto;
            return respuesta;
        }
          public double SumarDosNumeros (double poblacion , double dato){
            double salida = poblacion + dato ;
            return salida ;
    }
          public void MostrarSumaYResta (){
              int resta = RestarDosNumeros(50,23 );
              double suma = SumarDosNumeros(89.29,233.002 );
              System.out.print("la respuesta de la resta es : " + resta);
              System.out.print("la respuesta de la suma es : " + suma);
          }
    
}
