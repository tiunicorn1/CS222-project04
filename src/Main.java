import java.util.Scanner;


public class Main
{

    public static void main(String[] args)
    {
        Scanner wages = new Scanner(System.in);
        double hoursWorked = 0.0;
        double wageRate = 0.0;
        double weeklyPay = 0.0;
        WageCalculator employee;


        System.out.print("Enter the number of hours worked: ");
        hoursWorked = wages.nextDouble();

        System.out.print("Enter the employee's hourly rate: ");
        wageRate = wages.nextDouble();

        employee = new WageCalculator(hoursWorked, wageRate);
        employee.calWeeklyPay(hoursWorked, wageRate);




    }
}
