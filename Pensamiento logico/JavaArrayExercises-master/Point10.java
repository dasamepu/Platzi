import java.util.Arrays;

public class Point10{
    public static void main(String[] args){
        int[] myInt = {51, 29, -2, -57, 88, 44, -83, 60, -3, 22};
        
        int min = myInt[0];
        int max = myInt[0];
        
        for(int i=0;i<myInt.length;i++){
            if(myInt[i]>max){
                max = myInt[i];
            }
            if(myInt[i]<min){
                min = myInt[i];
            }
        }
        System.out.println("The maximun number is: " + max);
        System.out.println("The minimun number is: " + min);
    }
}
