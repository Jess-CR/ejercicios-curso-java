import java.util.Scanner;

public class Codigo_introducir { 
 public static void main (String args []){

   Scanner teclado= new Scanner (System.in);
   String nombre = "";
   int numUno = 0, numDos = 0, resultado = 0;

   System.out.println("¿Cuál es tu nombre?");
   nombre = teclado.nextLine();

   System.out.println("Dame el primer valor para tu suma:");
   numUno = teclado.nextInt();

   System.out.println("Dame el segundo valor para tu suma:");
   numDos = teclado.nextInt();

   resultado = numUno + numDos; 
   System.out.println("Hola, " + nombre + " El resultado de tu suma es: " + resultado);
	
 }
}