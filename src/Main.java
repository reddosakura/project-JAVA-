import java.util.*;

public class Main {
    public static void init() {
        String name = null;
        String size = null;
        Integer price = null;
        ArrayList<ingredient> ings = new ArrayList<ingredient>();
        Scanner scan = new Scanner(System.in);
        boolean running = true;
        boolean intrrun = true;
        while(running){
            try{
                System.out.println("\nДобро пожаловать в проектировщик шаурмы\n\nВведите число:\n1) Создать проект\n2) Выход");
                int ch = scan.nextInt();
                switch (ch) {
                    case (1) -> {
                        System.out.println("Введите число:\n1) Стандартная шаурма\n2) Неясная шаурма\n3) Мистическая шаурма странного типа легендарного вида");
                        int ch2 = scan.nextInt();
                        switch (ch2) {
                            case (1) -> {
                                name = "Стандартная шаурма";
                                price = 120;
                            }
                            case (2) -> {
                                name = "Неясная шаурма";
                                price = 150;
                            }
                            case (3) -> {
                                name = "Мистическая шаурма странного типа легендарного вида";
                                price = 200;
                            }
                            default ->
//                            running = false;
                                    throw new Exception();
                        }
                        System.out.println("Введите число:\n1) Большевик\n2) Меньшевик\n3) Трудовик");
                        int ch3 = scan.nextInt();
                        switch (ch3) {
                            case (1) -> {
                                size = "Большевик";
                                price += 100;
                            }
                            case (2) -> {
                                size = "Меньшевик";
                                price += 130;
                            }
                            case (3) -> {
                                size = "Трудовик";
                                price += 190;
                            }
                            default -> throw new Exception();
                        }
                        System.out.println("Введите число:\n1) Выбрать дополнительные ингредиенты\n2) Завершить заказ");
                        int ch4 = scan.nextInt();
                        switch (ch4) {
                            case (1) -> {
                                while (intrrun) {
                                    System.out.println("Введите число:\n1) Лаваш со вкусом социал-дарвинизма\n2) Мясо монархиста\n3) Капуста демократа\n4) Картошка либералиста\n5) Тротил анахро-коммуниста\n6) Завершить заказ");
                                    int ch41 = scan.nextInt();
                                    switch (ch41) {
                                        case (1) -> ings.add(new ingredient("Лаваш со вкусом социал-дарвинизма", 30));
                                        case (2) -> ings.add(new ingredient("Мясо монархиста", 45));
                                        case (3) -> ings.add(new ingredient("Капуста демократа", 56));
                                        case (4) -> ings.add(new ingredient("Картошка либералиста", 78));
                                        case (5) -> ings.add(new ingredient("Тротил анахро-коммуниста", 89));
                                        case (6) -> {
                                            shawarma shaw = new shawarma(name, price, size, ings);
                                            System.out.format("Чертеж шаурмы:\nНазвание: %s\nРазмер: %s\nДополнительные ингредиенты:\n%s\nИтоговая цена: %s\n", shaw.getName(), shaw.getSize(), shaw.PrintAllIngredients(), shaw.GetTotallPrice() + "");
                                            intrrun = false;
                                        }
                                        default -> {
                                            intrrun = false;
                                            shawarma errshaw = new shawarma(name, price, size, ings);
                                            System.out.println("Фатальная ошибка\nПрограмма недопустила коллапса и слила ваш проект");
                                            System.out.format("Чертеж шаурмы:\nНазвание: %s\nРазмер: %s\nДополнительные ингредиенты:\n%s\nИтоговая цена: %s\n", errshaw.getName(), errshaw.getSize(), errshaw.PrintAllIngredients(), errshaw.GetTotallPrice() + "");
                                        }
                                    }
                                }
                            }
                            case (2) -> {
                                shawarma shaw = new shawarma(name, price, size, ings);
                                System.out.format("Чертеж шаурмы:\nНазвание: %s\nРазмер: %s\nИтоговая цена: %s\n", shaw.getName(), shaw.getSize(), shaw.GetTotallPrice() + "");
                            }
                            default -> throw new Exception();
                        }
                    }
                    case (2) -> running = false;
                    default -> System.out.println("Месье вы чорт");
                }

            } catch (Exception e){
                System.out.println("Месье вы допустили серьезную конструкционную ошибку в процессе проектирования\nВиртуальная среда конструирования недопустила коллапса и всего лишь слила ваш проект,\nтеперь вам придется конструировать шаурму заново");
                running = false;
            }
        }
    }

    public static void main(String[] args) {
        init();
    }
}
