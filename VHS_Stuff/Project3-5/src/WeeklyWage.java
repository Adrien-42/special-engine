import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyWage {

    private Scanner reader = new Scanner(System.in);

    ArrayList<Double> dailyEarnings = new ArrayList<>();

    private double totalPay =0;

    //Calculates the money earned on a given day based on the hourly wage and time work, including overtime.
    private void dailyWageCalculator(String day, double wage) {

        int regHours;
        int overHours;

        System.out.print("How many hours did you work on " + day +", excluding overtime? ");
        regHours = reader.nextInt();

        System.out.print("How many hours of overtime did you work on " + day + "? ");
        overHours = reader.nextInt();

        dailyEarnings.add((regHours * wage) + (1.5 * overHours * wage));
    }
    //Systematically provides the day name to dailyWageCalculator and outputs the total weekly pay
    private double weeklyWageCalculator(double wage){
        for(int i=0; i<5; i++){
            switch(i){
                case 0 :
                    dailyWageCalculator("Monday", wage);
                    System.out.println();
                    break;
                case 1:
                    dailyWageCalculator("Tuesday", wage);
                    System.out.println();
                    break;
                case 2:
                    dailyWageCalculator("Wednesday", wage);
                    System.out.println();
                    break;
                case 3:
                    dailyWageCalculator("Thursday", wage);
                    System.out.println();
                    break;
                case 4:
                    dailyWageCalculator("Friday", wage);
                    System.out.println();
                    break;
            }
            totalPay = totalPay + dailyEarnings.get(i);
        }
        return totalPay;
    }

    public static void main(String[] args) {

        WeeklyWage pay = new WeeklyWage();

        System.out.print("How much do you make per hour: ");
        double hourlyWage = pay.reader.nextDouble();
        System.out.println();

        System.out.println("Your weekly earnings were: $"+pay.weeklyWageCalculator(hourlyWage));
    }
}