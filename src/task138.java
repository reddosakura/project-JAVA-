import com.sun.source.tree.MemberSelectTree;

import java.lang.constant.Constable;
import java.util.Scanner;

public class task138 {
//    public static int getSide(int x, int y){
//        return Math.sqrt(Math.pow())
//    }
    public static void main(String[] args) {
        System.out.println("Введите размер множества точек (число должно быть больше 3):");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        try{
            if (size > 3){
                int[] x_arr = new int[size];
                int[] y_arr = new int[size];
                int cA = 0, cB = 0, cC = 0;
                for (int i = 0; i < size; i++){
                    System.out.println("Введите координату X:");
                    int num = scan.nextInt();
                    x_arr[i] = num;
                    System.out.println("Введите координату У");
                    int num2 = scan.nextInt();
                    y_arr[i] = num2;
                }
                double minP = 1.79769313486231E308;
                for (int i = 0; i < size - 2; i++){
                    for (int j = i + 1; j < size - 1; j++){
                        for (int k = j + 1; k < size; k++){
                            int AB = (int)Math.sqrt(Math.pow((x_arr[j] - y_arr[i]), 2) + Math.pow((y_arr[j] - y_arr[i]), 2));
                            int BC = (int)Math.sqrt(Math.pow((x_arr[k] - x_arr[j]), 2) + Math.pow((y_arr[k] - y_arr[j]), 2));
                            int AC = (int)Math.sqrt(Math.pow((x_arr[k] - x_arr[i]), 2) + Math.pow((y_arr[k] - y_arr[i]), 2));
                            int P = AB + BC + AC;
                            if (P < minP){
                                minP = P;
                                cA = i;
                                cB = j;
                                cC = k;
                            }
                        }
                    }
                }
                System.out.printf("Минимальный периметр: " + minP + " Координаты: (%1$s;%2$s), (%3$s;%4$s), (%5$s;%4$s)", x_arr[cA], y_arr[cA], x_arr[cB], y_arr[cB], x_arr[cC], y_arr[cC]);

            }
            else {
                System.out.println("Некорректное значение");
            }
        }
        catch (Exception e){
            System.out.println("Некорректное значение");
//            System.out.println(e);
        }
    }
}
