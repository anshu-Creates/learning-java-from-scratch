import java.util.Scanner;

public class Strings{
    public static void main(String[] args) {
        // String Declaration & Initialization
        String firstName = "Anshu";
        String name = "Anshu";

        // // Taking String input using Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your last name : ");
        String lastName = sc.next();

        // String concatenation using +
        System.out.println(firstName + " " + lastName);

        // Use of nextLine()
        System.out.print("Enter your full name : ");
        String fullName = sc.nextLine();
        System.out.println(fullName);
        sc.close();

        // Finding String length using length()
        System.out.println(firstName.length());
        System.out.println(lastName.length());
        System.out.println(fullName.length());

        //Accessing characters using charAt()
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        // Comparing Strings using compareTo()
        if(firstName.compareTo(name) == 0){
            System.out.println("Strings are same");
        } else {
            System.out.println("Strings are not same");
        }

        // Extracting substrings using substring()
        String name1 = firstName.substring(3);
        System.out.println(name1);

    }
}