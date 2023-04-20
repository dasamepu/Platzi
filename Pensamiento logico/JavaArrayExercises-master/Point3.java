public class point3{
    public static void main(String[] args){
        int rows = 10;
        int columns = 10;
        String[][] myString = new String[rows][columns];
        
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                myString[i][j] = "-";
                System.out.print(myString[i][j]);
            }
            System.out.println();
        }
    }
}
