import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;



class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";       // RED
    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";     // GREEN
    public static final String MAGENTA_BACKGROUND_BRIGHT = "\033[0;105m";   // MAGENTA

    public static void init()
    {
        Scanner scan = new Scanner(System.in);
//        System.out.println("(1) - Черный текст\n(2) - Красныйтекст\n(3) - Мажента текст");
        System.out.println("(1) - Черный текст\n(2) - Красныйтекст\n(3) - Мажента текст");
        try{
            int choose1 = scan.nextInt();
            String color = null;
            switch (choose1) {
                case 1 -> color = ANSI_BLACK;
                case 2 -> color = ANSI_RED;
                case 3 -> color = ANSI_PURPLE;
                default -> System.out.println("Некорректное значение");
            }
            System.out.println("(1) - Красный фон\n(2) - Зеленый фон\n(3) - Мажента фон");
            System.out.println("Выберите цвет фона");
            String bgcolor = null;
            int choose2 = scan.nextInt();
            switch (choose2) {
                case 1 -> bgcolor = RED_BACKGROUND_BRIGHT;
                case 2 -> bgcolor = GREEN_BACKGROUND_BRIGHT;
                case 3 -> bgcolor = MAGENTA_BACKGROUND_BRIGHT;
                default -> System.out.println("Некорректное значение");
            }
//            System.out.println(Color.RESET);
//            System.out.println(color);
//            System.out.println(bgcolor);
//            System.out.println(bgcolor + color + "Введите номер цвета текста: ");
            System.out.println(bgcolor + color + "Введите число А: ");
            int A = scan.nextInt();
            System.out.println(bgcolor + color + "Введите число B: ");
            int B = scan.nextInt();
            for (int i = A; i <= B; i++)
            {
//            System.out.println(i);
                for (int j = 0; j < i; j++)
                {
                    System.out.println(bgcolor + color + i);
                }
//            for (int j = 0; j != i; j++)
//            {
//                System.out.println(j);
//            }
            }
        }
        catch (Exception e){
            System.out.println("Некорректное значение");

        }

    }
    public static void main(String[] args) {
        init();

    }
}