import java.util.Scanner;

 // Compiler version JDK 11.0.2

 public class punto_3
 {
   public static void main(String args[])
   { 
     int n,i,rs=0;
     double pr = 0;
     
     for(i=1;i<=10;i++){
       System.out.println("Digite la nota "+i+" :");
       n = entrada.nextInt();
       rs=rs+n;
     }
     
       pr=rs/10;
       System.out.println("el promedio es: "+pr);
   }
 }
