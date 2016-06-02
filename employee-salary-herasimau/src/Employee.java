/**
 * @author herasimau on 01.06.2016.
 */
public class Employee {
        private final static String ERROR_PAY = "Зарплата не может быть меньше 8 долларов в час";
        private final static String ERROR_HOUR = "Количество часов не может быть больше 60";
        private final static int MAX_HOUR = 60;
        private final static int MIN_PAY = 8;

    public static void main(String[] args) {
        System.out.println(calculateEmployeeSalary(8,50));
    }

    public static Double calculateEmployeeSalary(double hourPay,double totalHours){
        boolean errors = false;
        if(hourPay<MIN_PAY){
            try {
                errors = true;
                throw new Exception(ERROR_PAY);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if(totalHours>MAX_HOUR){
            try {
                errors = true;
                throw new Exception(ERROR_HOUR);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if(!errors) {
            double salary;
            if (totalHours > 40) {
                salary = hourPay * 40 + (totalHours - 40) * hourPay * 1.5;
                return salary;
            }
            salary = hourPay * totalHours;
            return salary;
        }
       return null;
    }
}
