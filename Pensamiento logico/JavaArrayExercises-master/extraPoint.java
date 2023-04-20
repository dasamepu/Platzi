import java.util.Arrays;
import java.util.Scanner;

public class extraPoint{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements that will be in the array: ");
        int length = input.nextInt();
        int[] myInt = new int[length];
        for(int i=0; i<myInt.length; i++){
            System.out.println("Enter the value of the element " + (i+1) + ": ");
            myInt[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(myInt));
    }
}
