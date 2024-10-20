
import java.util.Scanner;

public class gradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first marks: ");
        int marks1 = sc.nextInt();

        System.out.println("Enter the second marks: ");
        int marks2 = sc.nextInt();

        //calculate the total marks

        int totalMarks = marks1 + marks2;
        char grade;
        switch(totalMarks/6){
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
                break;


        }
        //output the grade
        System.out.println(" Your marks is: " + totalMarks);
        System.out.println("The grade is: " + grade);
        

        
                
    }
}