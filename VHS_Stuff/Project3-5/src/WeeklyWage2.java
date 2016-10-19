import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WeeklyWage2 {
    private Scanner reader = new Scanner(System.in);

    private ArrayList<Double> dailyEarnings = new ArrayList<>();
    private ArrayList<String> weekDays = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday"));

    //Calculates the money earned on a given day based on the hourly wage and time work, including overtime.
    private void dailyWageCalculator(String day, double wage) {
        int regHours;
        int overHours;

        System.out.print("How many hours did you work on " + day + ", excluding overtime? ");
        regHours = reader.nextInt();

        System.out.print("How many hours of overtime did you work on " + day + "? ");
        overHours = reader.nextInt();

        dailyEarnings.add((regHours * wage) + (1.5 * overHours * wage));
    }
    //Systematically provides the day name to dailyWageCalculator and outputs the total weekly pay
    private double weeklyWageCalculator(double wage){
        double totalPay = 0;

        for(int i=0; i<5; i++){
            dailyWageCalculator(weekDays.get(i), wage);
            System.out.println();
            totalPay = totalPay + dailyEarnings.get(i);
        }
        return totalPay;
    }
    public static void main(String[] args) {
        WeeklyWage2 pay = new WeeklyWage2();

        System.out.print("How much do you make per hour: ");
        double hourlyWage = pay.reader.nextDouble();
        System.out.println();

        System.out.println("Your weekly earnings were: $"+pay.weeklyWageCalculator(hourlyWage));
    }
}