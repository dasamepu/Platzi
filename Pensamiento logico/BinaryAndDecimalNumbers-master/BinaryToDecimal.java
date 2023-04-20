import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) {
    System.out.println("Enter a binary number: ");
    Scanner input = new Scanner(System.in);
    int binary = input.nextInt();
    System.out.println("You entered: " + binary);

    int binary1 = binary;
    int binary2 = binary;
    int i = 0;
    while(binary1 > 0){
      int remainder = binary1 % 10;
      binary1 = binary1 / 10;
      i = i + 1;
    }
    
    int[] myArray = new int[i];
    int j = myArray.length;
    int[] arrayM = new int[i];
    int k = 0;
    while(binary2 > 0 && k<i){
      int remainder2 = binary2 % 10;
      binary2 = binary2 / 10;
      System.out.println("\n The number we take(the last): " + remainder2 + "\n The rest of the number: " + binary2);
      
      myArray[j-1] = remainder2;
      int p = (int) Math.pow(2, k);
      System.out.println("The number 2 raised to the power of its index (" + k + "): " + p);

      int m = remainder2 * p;
      System.out.println("The multiplication between the number we take(" + remainder2 + ") and the number 2 raised to the power of its index(" + p + ") is: " + m);

      arrayM[j-1] = m;
      
      k=k+1;
      j=j-1;
    }
    System.out.println("\n" + Arrays.toString(myArray));
    System.out.println("\n" + Arrays.toString(arrayM));

    int decimal = 0;
    for(int l=0; l<arrayM.length; l++){
      decimal = decimal + arrayM[l];
    }
    System.out.println("The binary number (" + binary + ") converted to decimal is: "+ decimal);
    
  }
}
