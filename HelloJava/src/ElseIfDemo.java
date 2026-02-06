import java.util.Scanner;

public class ElseIfDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your mark: ");
        int mark = sc.nextInt();

        if (mark >= 90) {
            System.out.println("Grade A");
        }
        else if (mark >= 70) {
            System.out.println("Grade B");
        }
        else if (mark >= 50) {
            System.out.println("Grade C");
        }
        else {
            System.out.println("Fail");
        }
    }
}