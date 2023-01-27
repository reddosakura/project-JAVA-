
import java.util.Scanner;

public class task30 {
    public static void init()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("(1) - Черный текст\n(2) - Красныйтекст\n(3) - Мажента текст");
        try{
            int choose1 = scan.nextInt();
            Color color;
            switch (choose1) {
                case 1 -> color = Color.BLACK;
                case 2 -> color = Color.RED;
                case 3 -> color = Color.MAGENTA;
                default -> System.out.println("Некорректное значение");
            }
            System.out.println("(1) - Красный фон\n(2) - Зеленый фон\n(3) - Мажента фон");
            System.out.println("Выберите цвет фона");
            Color bgcolor;
            int choose2 = scan.nextInt();
            switch (choose2) {
                case 1 -> bgcolor = Color.RED_BACKGROUND_BRIGHT;
                case 2 -> bgcolor = Color.GREEN_BACKGROUND_BRIGHT;
                case 3 -> bgcolor = Color.MAGENTA_BACKGROUND_BRIGHT;
                default -> System.out.println("Некорректное значение");
            }
            int A = scan.nextInt();
            int B = scan.nextInt();
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
            System.out.println(count);
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
