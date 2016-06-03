package table;

/************************************
 * Created by dns2316 on 03.06.2016.*
 ***********************************/
public class main {
    public static void main(String[] args){
        a2 aa = new a2();
        for (int i = 2; i < 9; i++){
            int tablex[] = aa.create(i);
            int first_int =i;
            for (int i = 0; tablex > i; i++){
                System.out.println(first_int + " * " + tablex[i+1] + " = " + tablex[i]);
            }
        }
    }

}