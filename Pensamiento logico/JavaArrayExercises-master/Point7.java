import java.util.Arrays;
import java.util.Scanner;

public class Point7{
    public static void main(String[] args){
        int[] myInt = {35, 31, 51, 26, 30, 12, 75, 65, 87, 63};
        System.out.println(Arrays.toString(myInt));
        Scanner input = new Scanner(System.in);
        System.out.println("Wich number do you want to remove?: ");
        int remove = input.nextInt();
        System.out.println("The number you want to remove is: " + remove);
        
        boolean is_in_the_array = false;
        
        int[] newArray = new int[myInt.length - 1];
        
        for(int i=0, i2 = 0; i<myInt.length; i++){
            is_in_the_array = true;
            if(myInt[i]==remove){
                continue;
            }
            newArray[i2++] = myInt[i];
        }
        if(is_in_the_array == false){
            System.out.println("The number you want to remove is not in the array");
        }
        System.out.println("The new array without " + remove + " is " + Arrays.toString(newArray));
    }
}
