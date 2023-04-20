import java.util.*;

class Main {
  public static void main(String[] args) {
    
    System.out.println("Enter a binary number: ");
    Scanner input = new Scanner(System.in);
    int binary = input.nextInt();
    System.out.println("You entered: " + binary);

    int binary1 = binary;
    int binary1_2 = binary;
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
    while(binary1_2 > 0 && k<i){
      int remainder1_2 = binary1_2 % 10;
      binary1_2 = binary1_2 / 10;
      
      myArray[j-1] = remainder1_2;
      int p = (int) Math.pow(2, k);

      int m = remainder1_2 * p;

      arrayM[j-1] = m;
      
      k=k+1;
      j=j-1;
    }

    int decimal = 0;
    for(int l=0; l<arrayM.length; l++){
      decimal = decimal + arrayM[l];
    }
    
  

  
    System.out.println("\n Enter another binary number: ");
    int binary2 = input.nextInt();
    System.out.println("You entered: " + binary2);

    int binary2_1 = binary2;
    int binary2_2 = binary2;
    int i2 = 0;
    while(binary2_1 > 0){
      int remainder2 = binary2_1 % 10;
      binary2_1 = binary2_1 / 10;
      i2 = i2 + 1;
    }
    
    int[] myArray2 = new int[i2];
    int j2 = myArray2.length;
    int[] arrayM2 = new int[i2];
    int k2 = 0;
    while(binary2_2 > 0 && k2<i2){
      int remainder2_1 = binary2_2 % 10;
      binary2_2 = binary2_2 / 10;
      
      myArray2[j2-1] = remainder2_1;
      int p2 = (int) Math.pow(2, k2);

      int m2 = remainder2_1 * p2;
      

      arrayM2[j2-1] = m2;
      
      k2++;
      j2--;
    }

    int decimal2 = 0;
    for(int l2=0; l2<arrayM2.length; l2++){
      decimal2 = decimal2 + arrayM2[l2];
    }



    
    int decimal_sub = decimal - decimal2;

     int dividend = decimal_sub;
    int dividend2 = decimal_sub;
    
    int i3 = 0;
    do{
      
      int quotient = dividend / 2;
      
      dividend = quotient;

      i3 ++;
      
    }while(dividend>=1);
    
    int[] myArray3 = new int[i3];
    int j3 = myArray3.length;
    do{
      
      int quotient2 = dividend2 / 2;
      int remainder3 = dividend2 % 2;
      dividend2 = quotient2;

      myArray3[j3-1] = remainder3;
      
      j3--;
      
    }while(dividend2>=1 && j3 > 0);

    int r = 0;
    int binary_sub = 0;
    for(int k3 =0 ; k3<myArray3.length ; k3++){
      r = binary_sub * 10;
      binary_sub = r + myArray3[k3];
    }
    
    System.out.println("The substraction of " + binary + " and " + binary2 + " is: " + binary_sub);
  }
}
