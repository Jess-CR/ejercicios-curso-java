import java.util.Scanner; 

public class Ejercicio17{

  public static void main (String args[]){

  Scanner teclado = new Scanner (System.in);

  String name1 = "";
  String name2 = "";

  System.out.println ("");
  System.out.println ("**********************");
  System.out.println ("Este programa le permitirá validar si los nombres que ingresa son iguales");
  System.out.println ("**********************");
  System.out.println ("");
  System.out.println ("");
  
  System.out.println ("Ingrese el primer nombre");
  name1 = teclado.nextLine();

  System.out.println ("Ingrese el segundo nombre");
  name2 = teclado.nextLine();

  if(name1.equalsIgnoreCase(name2) ){
   System.out.println("Los nombres son iguales");
  } else{ 
   System.out.println("Los nombres no son iguales");
  }
 }
}