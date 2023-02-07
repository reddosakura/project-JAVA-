import java.util.Arrays;
import java.util.Scanner;
import java.lang.System;

public class task23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();
        int[][] a = new int[M][N]; //создание массива a размером 10*10

        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                a[i][j] = (int) Math.round((Math.random() * 256)); //генерируем число от 0 до 255. (int) означает приведение
            }
            //результата к типу int
            System.out.println("Наиеньшее число в строке " + i + ": " + Arrays.stream(a[i]).min().getAsInt());
        }

//        for (int i=0; i<M; i++) {//вывод матрицы
//            for (int j=0; j<N; j++) {
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.print("\n");//переход на новую строчку
//        }
//
    }
}

