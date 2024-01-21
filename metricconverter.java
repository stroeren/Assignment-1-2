import java.util.Scanner;

public class metricconverter {
    public static void main(String[] args) throws Exception {
        System.out.println("***Bomba's Metric Converter!***");
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        System.out.println("Welcome to Bomba's Metric Converer!");
        System.out.println("Enter a choice: 1. Miles to Kilometers 2. Feet to Meters 3. Inches to Centimeters 4. Pounds to Kilograms 5. Quit");
        choice = scanner.nextInt();
        while (choice != 5) {
            if (choice == 1) {
                System.out.println("Enter a distance in miles");
                double miles = scanner.nextDouble();
                double kilometers = miles * 1.60934;
                System.out.println(miles + " miles is " + kilometers + " kilometers");
            }
            if (choice == 2) {
                System.out.println("Enter a distance in feet");
                double feet = scanner.nextDouble();
                double meters = feet * 0.3048;
                System.out.println(feet + " feet is " + meters + " meters");
            }
            if (choice == 3) {
                System.out.println("Enter a distance in inches");
                double inches = scanner.nextDouble();
                double centimeters = inches * 2.54;
                System.out.println(inches + " inches is " + centimeters + " centimeters");
            }
            if (choice == 4)
            {
                System.out.println("Enter a weight in pounds.");
                double pounds = scanner.nextDouble();
                double kilograms = pounds * 0.453592;
                System.out.println(pounds + " pounds is " + kilograms + " kilograms");
            }
            System.out.println("Enter a choice: 1. Miles to Kilometers 2. Feet to Meters 3. Inches to Centimeters 4. Quit");
            choice = scanner.nextInt();
        }
        scanner.close();
    }
}
