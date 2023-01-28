
import java.util.Scanner;

public class task30 {
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
//            System.out.println(color);
//            System.out.println(bgcolor);
            System.out.println(bgcolor + color + "Введите первое число");
            int A = scan.nextInt();
            System.out.println(bgcolor + color + "Введите второе число");
            int B = scan.nextInt();
            System.out.println(bgcolor + color + "Введите значение стороны");
            int C = scan.nextInt();
            int squareR = 0;
            int squareQ = 0;
            int count = 0;

            for (int i = 1; i <= B; i++){
                squareR += A;
            }
            for(int i = 1; i <= C; i++){
                squareQ += C;
            }
            while(squareR > 0){
                squareR -= squareQ;
                count += 1;
            }
            System.out.println(bgcolor + color + "Результат: " + count);
        }
        catch (Exception e){
            System.out.println("Некорректное значение");

        }
//        try{

    }
    public static void main(String[] args) {

        init();


    }
}
