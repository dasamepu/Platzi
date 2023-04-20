import java.util.Arrays;
import java.util.Scanner;

public class Point8{
    public static void main(String[] args){
        int[] myInt = {81, 3, -31, -53, 27, 23, 11, -12, 71, -28};
        System.out.println(Arrays.toString(myInt));
        int[] myIntCopy = new int[myInt.length];
        
        for(int i = 0, k = 0; i < myInt.length ; i++){
            myIntCopy[k++] = myInt[i];
        }
            System.out.println(Arrays.toString(myIntCopy));
    }
}
