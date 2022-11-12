import java.util.Scanner;
import java.util.Arrays;

public class Point6{
    public static void main(String[] args){
        int[] myInt = {60, 21, 99, 7, 19, 68, 91, 9, 50, 72, 87, 45};
        System.out.println(Arrays.toString(myInt));
        
        Scanner input = new Scanner(System.in);
        System.out.print("Which is the number you want to know its index position: ");
        int num = input.nextInt();
        
        boolean is_in_the_array = false;
        for(int i=0; i<myInt.length; i++){
            if(num == myInt[i]){
                System.out.println("The index position of " + num + " is: " + i);
                is_in_the_array = true;
            }   
        }
        if(is_in_the_array == false){
                System.out.println("The number you are looking for in not in the index");
        }
    }
}
