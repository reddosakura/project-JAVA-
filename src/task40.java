import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

enum Color {
    //Color end string, color reset
    RESET("\033[0m"),

    // Regular Colors. Normal color, no bold, background color etc.
    BLACK("\033[0;30m"),    // BLACK
    RED("\033[0;31m"),      // RED
    MAGENTA("\033[0;35m"),  // MAGENTA

    // High Intensity backgrounds
    RED_BACKGROUND_BRIGHT("\033[0;101m"),       // RED
    GREEN_BACKGROUND_BRIGHT("\033[0;102m"),     // GREEN
    MAGENTA_BACKGROUND_BRIGHT("\033[0;105m");   // MAGENTA

    private final String code;

    Color(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}

class Main {
    public static void init()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("(1) - Черный текст\n(2) - Красныйтекст\n(3) - Мажента текст");
        try{
            int choose1 = scan.nextInt();
            Color color = null;
            switch (choose1) {
                case 1 -> color = Color.BLACK;
                case 2 -> color = Color.RED;
                case 3 -> color = Color.MAGENTA;
                default -> System.out.println("Некорректное значение");
            }
            System.out.println("(1) - Красный фон\n(2) - Зеленый фон\n(3) - Мажента фон");
            System.out.println("Выберите цвет фона");
            Color bgcolor = null;
            int choose2 = scan.nextInt();
            switch (choose2) {
                case 1 -> bgcolor = Color.RED_BACKGROUND_BRIGHT;
                case 2 -> bgcolor = Color.GREEN_BACKGROUND_BRIGHT;
                case 3 -> bgcolor = Color.MAGENTA_BACKGROUND_BRIGHT;
                default -> System.out.println("Некорректное значение");
            }
            System.out.println(Color.RESET);
            System.out.println(color);
            System.out.println(bgcolor);
            System.out.println("Введите номер цвета текста: ");
            System.out.println("Введите число А: ");
            int A = scan.nextInt();
            System.out.println("Введите число B: ");
            int B = scan.nextInt();
            for (int i = A; i <= B; i++)
            {
//            System.out.println(i);
                for (int j = 0; j < i; j++)
                {
                    System.out.println(i);
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