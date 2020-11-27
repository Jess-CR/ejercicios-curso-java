import java.util.Scanner;

public class MejorasEjercicio11{
 public static void main (String args[]){
  
  Scanner teclado = new Scanner(System.in);
  int num_uno = 0, num_dos = 0, resultado = 0; 
  int parametro = 0;

  System.out.println("");
  System.out.println("**********");
  System.out.println("Bienvenido a su calculadora básica");
  System.out.println("**********");
  System.out.println("");
  System.out.println("Seleccione una opcion del menu para identificcar qué operación aritmética desea realizar: ");
  System.out.println("");
  System.out.println("Opcion 1 --> suma");
  System.out.println("Opcion 2 --> resta");
  System.out.println("Opcion 3 --> multiplicación");
  System.out.println("Opcion 4 --> división");
  System.out.println("");
  System.out.println("");
  System.out.println("Ingrese la opción de la operación que desea realizar:");
  parametro = teclado.nextInt();

  System.out.println("Ingrese el primer valor");
  num_uno = teclado.nextInt();

  System.out.println("Ingrese el segundo valor");
  num_dos = teclado.nextInt();

  
  switch (parametro){
    case 1:resultado = num_uno + num_dos;
	System.out.println("El resultado de la suma es: " + resultado);
	break;
    case 2:resultado = num_uno - num_dos;
	System.out.println("El resultado de la resta es: " + resultado);
	break;
    case 3:resultado = num_uno * num_dos;
	System.out.println("El resultado de la multiplicación es: " + resultado);
	break;
    case 4:resultado = num_uno / num_dos;
	System.out.println("El resultado de la división es: " + resultado);
	break;
   default:System.out.println("Error, la opción no existe");
	break;
  }
 }
}
