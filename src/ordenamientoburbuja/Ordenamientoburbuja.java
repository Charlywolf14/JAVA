/*
* 5090-18-1749
* Carlos Rodolfo Bendfeldt Samayoa 
*
*/

package ordenamientoburbuja;
import java.util.Scanner;
public class Ordenamientoburbuja {
      public static int[] metodoburbuja(int[] arreglo)
    {
        System.out.print("METODO DE BURBUJA\n");//Descripcion del metodo de burbuja 
        System.out.print("Es un sencillo algoritmo de ordenamiento\n");
        System.out.print("Funciona revisando cada elemento de la lista que va a ser ordenada con el siguiente, intercambiándolos de posición si están en el orden equivocado.\n");
      int auxiliar;
      int[] arregloOrdenado;
      for(int i = 1; i < arreglo.length; i++)//length para el tamano del arreglo
      {
        for(int j = 0;j < arreglo.length-i;j++)
        {
          if(arreglo[j] > arreglo[j+1])
          {
            auxiliar = arreglo[j];
            arreglo[j] = arreglo[j+1];
            arreglo[j+1] = auxiliar;
            //este if es para que se guarde en arreglo y ordene los datos del arreglo
             
          }   
        }
      }
      arregloOrdenado = arreglo;
      return arregloOrdenado;// Regresera a mostrar el arreglo ordenado
    }
    public static void main(String[] args) {
        //Valores que tiene el arreglo desordenado.
      int arreglo[] = {95,85,45,12,36};// el arreglo ya tiene definido sus valores se le puede ingresar N cantidad de datos
      int arregloOrdenado[] = metodoburbuja(arreglo); 
      

      //Esto se utilizara para que se ordene y imprima los valores del arreglo 
      for(int i = 0; i < arregloOrdenado.length;i++)
        System.out.println(arregloOrdenado[i]);// Mostrara el arreglo ya ordenado
        
        
        
    }
    
}