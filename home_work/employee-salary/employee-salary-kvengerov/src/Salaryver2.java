
import java.util.Scanner;
/**
 * Created by User on 02.06.2016.
 */
public class Salaryver2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Зарплата в час: ");
        double i = Double.parseDouble(sc.next());

        System.out.print("Кол-во проработанных часов: ");
        int j = sc.nextInt();

        int s = salary (i,j);
        System.out.println(s);
    }

    static int salary (double money, int hour){

        if (money < 8 || hour > 60){
            System.out.println("Задача не выполнима, работник не может получать меньше 8 долларов в час или работать больше, чем 60 часов в неделю.");
            return (0);
        } else {
            if (hour > 40) {
                int b = (int) (40 + ((hour - 40) * 1.5));
                int result = (int) (money * b);
                return result;
            } else {
                int result = (int) (money * hour);
                return result;
            }

        }

    }
}