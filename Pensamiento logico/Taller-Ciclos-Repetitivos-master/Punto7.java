import java.util.Scanner;

 // Compiler version JDK 11.0.2
 
public class punto_7 {
    public static void main(String[] args) {
        int n;
        int i = 1;
        int n1 = 0;
        int sum = 0;
        int par = 0;
        int sum_total = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("digite un numero: ");
        n = keyboard.nextInt();   
        System.out.print("Los 10 primeros numeros pares desde " + n + " son: ");
        
        if(n%2 == 0){
            i = i + 1;
            n1 = n;
            System.out.println(n1 + ":");
        }
        
        for(i = i; i <= 10; i++){
          if(n%2 != 0){
            
            n = n + 1;
            par = n;
            System.out.println(n + ":");
            
          }else{
           
            n = n + 2;
            sum = sum + n; 
            System.out.println(n + ":");
           
          }
        } 
        
        sum_total = sum + par + n1;
        
        System.out.println("La suma de los 10 primeros numeros pares desde el numero digitado por teclado es: " + sum_total); 
    }
}
