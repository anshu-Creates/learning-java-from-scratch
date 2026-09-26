//sum of first n natural numbers.

public class practice1 {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for(int count = 1;count <= n; count++){
            sum = sum + count;
        }
        System.out.println(sum);
    }
}
