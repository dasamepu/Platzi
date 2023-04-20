import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.*;

public class PruebaArray {
    
    public static void main(String[] args) {
        int i;
        int sum = 0;
        long prod = 1;
        
            int[] array1;
            String st;
            String[] stNew;
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Digite los numeros que desee excepto 9999 con un espcio entre cada numero, por ejemplo: 1 2 3 4 5"); 
            st = keyboard.nextLine(); //introducimos una cadena de texto 
            stNew = st.split(" "); //usamos split para separar los numeros que están en la cadena de texto
            array1 = new int[stNew.length]; //la cantidad de numeros en el array será igual a la cantidad de numeros extraidos de la cadena de texto
    
            for (i = 0; i < stNew.length; i++){
                array1[i] =  Integer.parseInt(stNew[i]); //el elemento i del array stNew va a convertirse en numero y va a convertirse en el elemento i del arrary array1 
                System.out.println("Se introdujo: " + array1[i]);
            }
            
        int max = array1[0];
        int min = array1[0];
        int myNumber = 1000;
        int distance = Math.abs(array1[0] - myNumber);
        int i2 = 0;
        for(i = 1; i < array1.length; i++){
            if(array1[i] > max){
                max = array1[i];
            }
            if(array1[i] < min){
                min = array1[i];
            }
            int distance2 = Math.abs(array1[i] - myNumber);
            if(distance2 < distance){
                i2 = i;
                distance = distance2;
            }
        }
        int theNumber = array1[i2];
        
        for(i = 0; i < array1.length; i++){
            if(array1[i] == 9999){
                        System.out.println("El dato 9999 no es valido");
                    
                    sum = 0;
                    sum = 0;
                    max = 0;
                    min = 0;
                    theNumber = 0;
                    myNumber = 0;
                    distance = 0;
            }    
            sum = sum + array1[i];
            prod = prod * array1[i];
        }

            System.out.println("Los datos introducidos son: " + Arrays.toString(array1));
            
            System.out.println("La suma de todos los datos introducidos es: " + sum);
            
            System.out.println("El producto de todos los datos introducidos es: " + prod);
            
            System.out.println("La cantidad de datos introducidos es: " + array1.length);
            
            System.out.println("El dato mayor introducido es: " + max);
            
            System.out.println("El dato menor introducido es: " + min);
            
            System.out.println("El dato introducido mas cercano a 1000 es: " + theNumber + " la distancia a " + myNumber + " es de " + distance + " unidades");
        
    }
}
