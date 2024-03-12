/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dahir;


import SENA.AtributosYMetodos;
import SENA.EstratoCliente;
import SENA.EstratoEmpleado;



/**
 *
 * @author User
 */
public class DAHIR {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AtributosYMetodos mostrarVriable = new AtributosYMetodos();
        mostrarVriable.MostrarSumaYResta();
        
        AtributosYMetodos mostrar = new AtributosYMetodos();
        mostrar.MultiplicarDosNumeros(3, 3);
  
        AtributosYMetodos instancia = new AtributosYMetodos();
        instancia.RestarDosNumeros(4, 2);
        
        EstratoCliente Variable = new EstratoCliente();
        Variable.Ejecuta();
        
        EstratoEmpleado ca = new EstratoEmpleado();
        ca.PedirCiudad();
        
        EstratoCliente ce = new EstratoCliente();
        ce.pedirEstrato();
        EstratoCliente cc = new EstratoCliente();
        cc.ClasificarEstrato();
          


  

 
        

            
            

    }
        // TODO code application logic here
    }