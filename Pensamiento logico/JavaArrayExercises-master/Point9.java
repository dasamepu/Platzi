import java.util.Arrays;
import java.util.Scanner;

public class Point9{
    public static void main(String[] args){
        int[] myInt = {-16, -40, 83, 16, 42, -48, -53, 30, -84, -76};
        System.out.println(Arrays.toString(myInt));
        int[] newArray = new int[myInt.length + 1];
        Scanner input = new Scanner(System.in);
        System.out.println("Which will be the number you want to insert?: ");
        int num = input.nextInt();
        System.out.println("The number you want to insert is " + num);
        System.out.println("What position do you want the number to be? (min 0 - max " + myInt.length + " ): ");
        int index = input.nextInt();
        System.out.println("The number will be in the index: " + index);
        
        if(index<0 || index>10)
        {
            System.out.println("Index no valid");
        }
        else{
            for(int i=0, k=0; i<myInt.length; i++){
                if(i == index){
                    newArray[k] = num;
                    k++;
                }
                newArray[k++] = myInt[i]; 
            }
        System.out.println(Arrays.toString(newArray));  
        }
    }
}
