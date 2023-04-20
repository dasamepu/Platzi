import java.util.Scanner;

 // Compiler version JDK 11.0.2

public class punto_6
 {
   public static void main(String args[])
   { 
     int n;
        Scanner keyboard = new Scanner(System.in); 
        System.out.println("Digite un numero entero");
        n = keyboard.nextInt();
     for (int i = 0; i < n; i++) {
        System.out.println("*");
     }
    
   }
 }
