public class pattern_4 {
    public static void main(String[] args) {
        // Inverted Half Pyramid
        int n = 7;
        for (int i = n; i >= 0; i--) {
            for(int j = 1; j <= i; j++){
                System.out.print("*");   
            }
            System.out.println(" ");
        } 
    }
}
