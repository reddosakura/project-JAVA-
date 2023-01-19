import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;
public class Main {
    public static int factorial(int a)
    {
        int result = 1;
        for(int i = 1; i <= a; i++)
        {
            result *= i;
        }
        return result;
    }
    public static void MenuAndMore()
    {
        System.out.println("Выберите операцию(число) затем введите значения:\n (1) Сложение\n (2) Вычитания\n (3) Деление\n (4) Умножение\n (5) Возведение в степень\n (6) Факториал\n (0) Выход\n\n\nВведите команду:");
//        String comm;
//        ArrayList<int> comms = new ArrayList<int>(){1, 2, 3, 4, 5};
//        boolean running = true;
        while (true)
        {
            try {
                Scanner scan = new Scanner(System.in);
                int comm = scan.nextInt();
                if (comm == 0)
                {
                    break;
                }
                switch(comm) {
                    case 1:
//                        try{
                            System.out.println("Введите первое число: ");
                            int value1 = scan.nextInt();
                            System.out.println("Введите второе число: ");
                            int value2 = scan.nextInt();
                            System.out.println("Результат сложения:");
                            System.out.println(value1 + value2);
//                            continue;
//                        System.out.println("-");
//                        }
//                        catch (Exception e) {
//                            System.out.println("Некорректный ввод");
//                            continue;
//                        }
                        break;
                    case 2:
//                        try{
                            System.out.println("Введите первое число: ");
                            int value3 = scan.nextInt();
                            System.out.println("Введите второе число: ");
                            int value4 = scan.nextInt();
                            System.out.println("Результат вычитания:");
                            System.out.println(value3 - value4);
//                            continue;
//                        System.out.println("-");
//                        }
//                        catch (Exception e) {
//                            System.out.println("Некорректный ввод");
//                            continue;
//                        }
                        break;
                    case 4:
//                        try{
                            System.out.println("Введите первое число: ");
                            int value5 = scan.nextInt();
                            System.out.println("Введите второе число: ");
                            int value6 = scan.nextInt();
                            System.out.println("Результат умножения:");
                            System.out.println(value5 * value6);
//                            continue;
//                        System.out.println("-");
//                        }
//                        catch (Exception e) {
//                            System.out.println("Некорректный ввод");
//                            continue;
//                        }
                        break;
                    case 3:
                        try{
                            System.out.println("Введите первое число: ");
                            int value7 = scan.nextInt();
                            System.out.println("Введите второе число: ");
                            int value8 = scan.nextInt();
                            System.out.println("Результат деления:");
                            System.out.println(value7 / value8);
//                            continue;
//                        System.out.println("-");
                         }
                        catch (ArithmeticException ae)
                        {
                            System.out.println("Деление на ноль невозможно");
                        }
                        break;
                    case 5:
//                        try{
                            System.out.println("Введите первое число: ");
                            int value11 = scan.nextInt();
                            System.out.println("Введите второе число: ");
                            int value12 = scan.nextInt();
                            System.out.println("Результат возведения в степень:");
                            System.out.println(Math.pow(value11, value12));
//                            continue;
//                        System.out.println("-");
//                        }
//                        catch (Exception e) {
//                            System.out.println("Некорректный ввод");
//                            continue;
//                        }
                        break;
                    case 6:
                        System.out.println("Введите число");
                        int value13 = scan.nextInt();
                        System.out.println("Найденный факториал");
                        System.out.println(factorial(value13));
                        break;
                    default:
                        System.out.println("Некорректная программа");
                        // code block
                }
                System.out.println("\n\nВыберите операцию(число) затем введите значения:\n (1) Сложение\n (2) Вычитания\n (3) Деление\n (4) Умножение\n (5) Возведение в степень\n (6) Факториал\n (0) Выход\n\n\nВведите команду:");
            }
            catch (Exception e){
                System.out.println("Некорректное значение");
                System.out.println("\n\nВыберите операцию(число) затем введите значения:\n (1) Сложение\n (2) Вычитания\n (3) Деление\n (4) Умножение\n (5) Возведение в степень\n (6) Факториал\n (0) Выход\n\n\nВведите команду:");
            }

        }
    }
    public static void main(String[] args) {
        MenuAndMore();

    }
}