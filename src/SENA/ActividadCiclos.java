/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SENA;

/**
 *
 * @author User
 */
public class ActividadCiclos {
    String[]ListaNombres = new String[11];
        
        public void CicloMientras(){
        ListaNombres = new String [11];
        ListaNombres[0] ="Edward Snowden";
        ListaNombres[1] = "Bill Gates";
        ListaNombres[2] = "Steve Jobs";
        ListaNombres[3] ="Mark Zukerberg";
        ListaNombres[4] = "German Cruz";
        ListaNombres[5] ="Linus Tolvards";
        ListaNombres[6] ="Grigori Perelman";
        ListaNombres[7] ="Terrence Tao";
        ListaNombres[8] ="James Gosling";
        ListaNombres[9] = "Steve Wozniak";
        ListaNombres[10]= "Stephen Hawking";
        int i = 0;
        while (i<ListaNombres.length){
            if(ListaNombres[i].endsWith("s")){
                System.out.println("el aprendiz"+(i)+"es"+ ListaNombres[i]);
            }
            
        }
        
    } 
     public void comienzanPost (){
         int i = 0;
         do {
             if(ListaNombres[i].startsWith("st")){
                 
             }
             i++;
         }while(1<ListaNombres.length);   
     }
}
