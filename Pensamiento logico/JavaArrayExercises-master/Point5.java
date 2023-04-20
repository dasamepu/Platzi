import java.util.Arrays;
import java.util.Scanner;

public class point5{
    public static void main(String[] args){
        int[] myInt = {2, 87, 45, 91, 58, 91, 87, 5, 64, 50, 29, 22};
        boolean is_in_the_array = false;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the specific value you are looking for in the array: ");
        int specific_value = keyboard.nextInt();
        System.out.println("The specific_value is: " + specific_value);
        
        for(int i=0; i<myInt.length;i++){
            if(specific_value==myInt[i]){
                System.out.println("THE NUMBER YOU ARE LOOKING FOR IS IN THE ARRAY");
                is_in_the_array = true;
            }
        }
        if(is_in_the_array == false){
                System.out.println("THE NUMBER YOU ARE LOOKING FOR IS NOT IN THE ARRAY");
        }
        System.out.print(Arrays.toString(myInt));
    }
}
