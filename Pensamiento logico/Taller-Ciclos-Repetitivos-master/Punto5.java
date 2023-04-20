import java.util.Scanner;

 // Compiler version JDK 11.0.2

 public class punto_5
 {
   public static void main(String args[])
   {
     System.out.println("Multiplos de 4 y 6 hasta 10000");
     
     for(int i = 1; i <= 10000; i++){
       if( i%4 == 0 && i%6 == 0){
          System.out.println(i);
       }
     }
   }
 }
