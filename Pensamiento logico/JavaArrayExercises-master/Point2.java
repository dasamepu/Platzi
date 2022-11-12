public class point2 {
    public static void main(String[] args) {
        int sum = 0;
        int i2 = 0;
        
        int[] myInt = {80,	6,	19,	93,	5, 72, 59, 44, 98, 32};
        for(int i = 0; i<myInt.length; i++){
            i2 = i + 1;
            System.out.println(" Num" + i2 + ": " + myInt[i] + " ");
            sum = sum + myInt[i];
        }
        System.out.println("the total sum is: " + sum);
    }
}
