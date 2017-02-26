/**
 * Created by tiuni on 2/25/2017.
 */
public class WageCalculator
{
    // Member Variables

    private double hoursWorked;
    private double wageRate;
    private double weeklyPay;


    // Constructors

    public WageCalculator()
    {

    }

    public WageCalculator(double hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }

    public WageCalculator(double hoursWorked, double wageRate)
    {
        this.hoursWorked = hoursWorked;
        this.wageRate = wageRate;
    }

    // Accessors

    public double getHoursWorked()
    {
        return hoursWorked;
    }

    public double getWageRate()
    {
        return wageRate;
    }

    public double getWeeklyPay()
    {
        return weeklyPay;
    }

    public String toString()
    {
        return String.format("Employee's pay for the week is: $%.2f", weeklyPay);
    }

    // Mutators


    public void setHoursWorked(double hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }

    public void setWageRate(double wageRate)
    {
        this.wageRate = wageRate;
    }

     public void calWeeklyPay(double hoursWorked, double wageRate)
    {
        if (hoursWorked > 40)
        {
            weeklyPay = ((hoursWorked - 40) * (wageRate + (wageRate / 2)) + (40 * wageRate));
        }
        else
        {
            weeklyPay = (hoursWorked * wageRate);
        }

        System.out.print(toString());


    }
}
