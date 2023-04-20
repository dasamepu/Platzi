import java.util.Scanner;

 // Compiler version JDK 11.0.2

 public class punto_4
 {
   public static void main(String args[])
   { 
     int pot = 0;
     int base = 0;
     int expo = 0;
        Scanner keyboard = new Scanner(System.in); 
        System.out.print("Digite la base de la potencia: ");
        base = keyboard.nextInt();
        System.out.print("Digite el exponente de la potencia: ");
        expo = keyboard.nextInt();

     pot = base;

     for (int i = 1; i < expo; i++) {
        pot = pot * base;
     }
     System.out.println(pot);
   }
 }
