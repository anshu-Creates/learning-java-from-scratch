import java.util.*;

public class printName {
    public static void printingName(String name){
        System.out.println("Your Name is "+ name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printingName(name);
    }
}
