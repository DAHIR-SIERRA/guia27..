/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SENA;
 import java.util.Arrays;
/**
 *
 * @author User
 */
public class Preguntas {
    public void ConversionEjemplo () {
    
        String miCadena = "Hola Mundo";
        String enMinusculas = miCadena.toLowerCase();
        System.out.println("Cadena original: " + miCadena);
        System.out.println("Cadena en minúsculas: " + enMinusculas); 
}    
    public void TangenteEjemplo () {
        double anguloEnRadianes = Math.toRadians(45); // Convertimos 45 grados a radianes
        double tangente = Math.tan(anguloEnRadianes);
        System.out.println("Tangente de 45 grados: " + tangente);
    }
   

public void OrdenamientoEjemplo (){
    
        // Arreglo de números desordenados
        int[] miArreglo = {5, 2, 9, 1, 7};

        // Ordenamos el arreglo en orden ascendente
        Arrays.sort(miArreglo);

        // Imprimimos el arreglo ordenado
        System.out.print("Arreglo ordenado: ");
        for (int num : miArreglo) {
            System.out.print(num + " ");
        }
    }
}




