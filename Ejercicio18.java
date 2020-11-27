import java.util.Scanner;

public class Ejercicio18{
 public static void main(String args[]){

 Scanner teclado = new Scanner(System.in);

 String cadena_original = "", cadena_substraccion = "";
 int 	valor1 = 0, valor2= 0, num_caracteres = 0;

   System.out.println("*******");
   System.out.println("Ingrese una cadena de caracteres");
   System.out.println("*******");
   System.out.println("");

   cadena_original = teclado.nextLine();

   num_caracteres = cadena_original.length();

   System.out.println("");
   System.out.println("El número de caracteres de la cadena que ingreso es de: " + cadena_original + " contiene " +
   			num_caracteres + " caracteres");
   System.out.print("¿ Desde qué parte de la cadena desea obtener?: ");
   valor1 = teclado.nextInt();
   System.out.print("¿ Hasta qué parte de la cadena desea obtener?: ");
   System.out.println("");
   valor2 = teclado.nextInt();

  cadena_substraccion = cadena_original.substring(valor1, valor2);
  System.out.println("La nueva cadena es: " + cadena_substraccion);
 }
}