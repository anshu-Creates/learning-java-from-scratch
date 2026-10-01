public class pattern_1{
    public static void main(String [] args){
        // Solid Rectangle
        int rows = 7;
        int columns = 7;

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= columns; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}