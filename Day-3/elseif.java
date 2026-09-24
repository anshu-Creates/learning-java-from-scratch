public class elseif {
    public static void main(String[] args) {
        int marks = 92;
        if(marks > 90){
            System.err.println("A Grade");
        } else if (marks > 80){
            System.out.println("B Grade");
        } else if (marks > 70){
            System.out.println("C Grade");
        } else if (marks > 60){
            System.out.println("D Grade");
        } else if (marks > 50){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
