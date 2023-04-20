import java.util.Scanner;

 // Compiler version JDK 11.0.2

 public class punto_2
 {
   public static void main(String args[])
   { 
     int sum = 0;
     int count = 0;
     int n = 0;
        Scanner keyboard = new Scanner(System.in); 
        System.out.println("Digite un numero entero");
        n = keyboard.nextInt();
        System.out.println("los numeros desde 1 hasta " + n + " son ");

     for (count = 1; count <= n; count++) {
        sum = sum + count;
        System.out.println(count);
     }
     
     System.out.println("la suma de todos los numeros es " + sum);
   }
 }
