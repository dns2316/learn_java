/**
 * Created by dns2316 on 02.06.2016.
 */
public class hours_pay {
    public static void main(String[]args){
        System.out.println("Salary: " + calculateSalary(8,50) + "$");// pay for 1 hour, hours in week
        System.out.println(average(5, 40));//days, hours in week
    }
    private static int calculateSalary(int pay, int hours){
        if (pay < 8 || hours > 60) {
            if (pay < 8) {
                System.out.println("WTF! Minimum 8$!");
            }
            if (hours > 60) {
                System.out.println("No no no. Maximum 60 hours in week!");
            }
            return (-1);
        }
        if (hours>40){
            hours = (int) (40 + ((hours - 40) * 1.5));
        }
        hours = hours * pay;
        return hours;
    }
    private static String average(int days, int hours){
        int x = hours / days;
        return "On average " + x + " hours per day. " + days + " days per week.";
    }
}
