public class point4{
    public static void main(String[] args){
        int sum = 0;
        int avg = 0;
        int[] myInt = {61, 2, 1, 97, 61, 3, 41, 8, 10, 1, 75};
        
        for(int i = 0; i<myInt.length; i++){
            int i2 = 0;
            
            i2 = i2 + i;
            System.out.println("num" + i2 + ": " + myInt[i]);
            sum = sum + myInt[i];
        }
        avg = sum / myInt.length;
        System.out.println("The average is: " + avg);
    }
}
