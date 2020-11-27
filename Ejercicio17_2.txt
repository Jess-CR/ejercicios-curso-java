import java.util.Scanner; 

public class Ejercicio17_2{

  public static void main (String args[]){

  Scanner teclado = new Scanner (System.in);

  String name1 = "Jessica";
  String pass1 = "bolsa de papel";
  String name2 = "";
  String pass2 = "";

  System.out.println ("");
  System.out.println ("**********************");
  System.out.println ("Favor de iniciar sesión");
  System.out.println ("**********************");
  System.out.println ("");
  System.out.println ("");
  
  System.out.print ("Ingrese su nombre de usuario: ");
  name2 = teclado.nextLine();

  System.out.print("Ingrese su contraseña: ");
  pass2 = teclado.nextLine();

  if(name1.equals(name2) && pass1.equals(pass2) ){
   System.out.println("Inicio de sesión correcto");
  } else{ 
   System.out.println("Nombre de usuario o password incorrectos");
  }
 }
}