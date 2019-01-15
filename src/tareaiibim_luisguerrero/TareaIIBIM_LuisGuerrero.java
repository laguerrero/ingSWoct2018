
package tareaiibim_luisguerrero;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Luis Guerrero
 */
public class TareaIIBIM_LuisGuerrero {

    
    public static void main(String[] args) throws FileNotFoundException {
    
        PrintStream archivo = new PrintStream("Promedio.txt");
        
 Scanner leer =  new Scanner(System.in);
        int notas;
        int suma = 0;
        int prom = 0;         

 System.out.print("ingrese cantidad de notas:");
        notas = leer.nextInt();

        for(int i=1; i<= notas; i++){
            System.out.println("ingrese nota"+" "+i+" "+"de"+" "+notas+":");
            int nota = leer.nextInt();  
            suma = suma + nota;
        }
            prom= suma /notas;
            System.out.println("promedio de las notas: " + prom );
          
      
      if(prom<16){
          System.out.println("Reprobado");
      } else
            System.out.println("Aprobado");
      
      
      archivo.print("EL PROMEDIO ES: " + prom);
      
    } 
    }
