package dahir;


import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Cliente {
    private int idCliente;
    private String nombreCliente;
    private String apellidoCliente;

    public Cliente(int idCliente, String nombreCliente, String apellidoCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
    }
    

    public void mif (){
       JOptionPane.showMessageDialog( null, "nombre " + this.nombreCliente);
    }
    
    public void mif2 (){
        JOptionPane.showMessageDialog(null, "nombre cliente " + this.idCliente);
    }
    
}