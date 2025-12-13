import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        char grade;
        if (marks >= 75)
            grade = 'A';
        else if (marks >= 60)
            grade = 'B';
        else if (marks >= 40)
            grade = 'C';
        else
            grade = 'F';
        switch (grade) {
            case 'A':
                System.out.println("Grade A");
                break;
            case 'B':
                System.out.println("Grade B");
                break;
            case 'C':
                System.out.println("Grade C");
                break;
            case 'F':
                System.out.println("Fail");
                break;
        }
    }
}
