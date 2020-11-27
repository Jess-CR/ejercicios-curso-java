public class CiclosDos{
 public static void main (String args []){

  int i = 1, j = 99;

  System.out.println("Serie con for: ");
  System.out.println("");

  for(i = 1; i <= 5; i++){
    if(i < 5){	
     System.out.print(i + ", ");
     System.out.print(j + ", ");
   } else {
     System.out.print(i + ", ");
     System.out.print(j);
   }
   j--;
  }
  System.out.println("");

   i = 1;
   j = 99;
  System.out.println("---------------------------");
  System.out.println("Serie con while: ");
  System.out.println("");

  while (i <= 5){
   if(i < 5){	
     System.out.print(i + ", ");
     System.out.print(j + ", ");
   } else {
     System.out.print(i + ", ");
     System.out.print(j);
   }
   i++;
   j--;
  }
 System.out.println("");

   i = 1;
   j = 99;

  System.out.println("---------------------------");
  System.out.println("Serie con do-while: ");
  System.out.println("");
 
 do {
  if(i < 5) {
   System.out.print(i + ", ");
   System.out.print(j + ", ");
  } else {
   System.out.print(i + ", ");
   System.out.print(j);
  }
   i++;
   j--;
  }while (i <= 5);
 }
}