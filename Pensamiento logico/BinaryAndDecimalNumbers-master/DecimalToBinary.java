import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the decimal number: ");      
    int decimal = input.nextInt();
    System.out.println("You entered: " + decimal);

    int dividend = decimal;
    int dividend2 = decimal;
    
    int i = 0;
    do{
      
      int quotient = dividend / 2;
      int remainder = dividend % 2;
      
      dividend = quotient;

      i += 1;
      
    }while(dividend>=1);
    System.out.println(i);
    
    int[] myArray = new int[i];
    int j = myArray.length;
    do{
      
      int quotient2 = dividend2 / 2;
      int remainder2 = dividend2 % 2;
      System.out.println("The result is: " + quotient2 + " and its remainder is: " + remainder2);
      dividend2 = quotient2;

      myArray[j-1] = remainder2;
      
      j -= 1;
      
    }while(dividend2>=1 && j > 0);
    System.out.println(Arrays.toString(myArray));

    int r = 0;
    int Binary = 0;
    for(int k =0 ; k<myArray.length ; k++){
      r = Binary * 10;
      Binary = r + myArray[k];
    }
    System.out.println("The decimal number " + decimal + " converted to binary is: " + Binary);
  }
}
