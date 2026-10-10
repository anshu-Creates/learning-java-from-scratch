import java.util.Scanner;

public class searchingIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int cols = sc.nextInt();
        System.out.println("Enter "+ (rows*cols) + " numbers : ");
        int[][] Arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.print("Enter number you are searching for : ");
        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(x == Arr[i][j]){
                    System.out.println("The number is found at index ("+ i +", "+ j + ")");
                }
            }
        }

        sc.close();

    }
}
