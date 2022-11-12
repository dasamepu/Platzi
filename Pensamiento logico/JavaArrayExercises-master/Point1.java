import java.util.Arrays;

public class Point1{
  public static void main(String[] args){
    String[] myString = {"this", "is", "a", "string"};
    System.out.println("Without sort: " + Arrays.toString(myString));
    Arrays.sort(myString);
    System.out.println("With sort: " + Arrays.toString(myString)); 
    
    int[] myInt = {5, 3, 2, 8, 8, 5};
    System.out.println("Without sort: " + Arrays.toString(myInt));
    Arrays.sort(myInt);
    System.out.println(" With sort: " + Arrays.toString(myInt));
  }
}
