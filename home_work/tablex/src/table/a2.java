package table;

/************************************
 * Created by dns2316 on 03.06.2016.*
 ***********************************/
public class a2 {

    public static int[] create(int x){
        int[] tablex = new int[9];
        for (int i = 1; i<10; i++){
            tablex[i] = x * i;
            tablex[i+1] = i;
        }
        return tablex;
    }
}
