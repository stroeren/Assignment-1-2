import java.util.Scanner;

public class gradecalculator {
    public static void main(String[] args) throws Exception {
        float grade;
        double gpa = 0.0;
        char letter = 'A';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a grade between 0 and 100");
        grade = scanner.nextFloat();
        while (grade < 0 || grade > 100) {
            System.out.println("Grade must be between 0 and 100. Please input again");
            grade = scanner.nextFloat();

        }
        scanner.close();
        if (grade >= 90 && grade <= 100)
        {
            letter = 'A';
            gpa = 4.0;
        }
        if (grade >= 80 && grade < 90)
        {
            letter = 'B';
            gpa = 3.0;
        }
        if (grade >= 70 && grade < 80)
        {
            letter = 'C';
            gpa = 2.0;
        }
        if (grade >= 60 && grade < 70)
        {
            letter = 'D';
            gpa = 1.0;
        }
        if (grade >= 0 && grade < 60)
        {
            letter = 'F';
            gpa = 0.0;
        }
        System.out.println("Grade = " + grade);
        System.out.println("Letter = " + letter);
        System.out.println("GPA = " + gpa);
    }
}
