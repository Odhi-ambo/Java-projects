
import java.util.Scanner;

public class gradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first grade: ");
        int marks1 = sc.nextInt();

        System.out.println("Enter the second grade: ");
        int marks2 = sc.nextInt();

        //calculate the total marks
        int total = marks1 + marks2;
        int grade = 85;
        if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else if (grade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}