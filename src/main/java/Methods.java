import java.util.Scanner;

public class Methods {
    public static Scanner scanner = new Scanner(System.in);
    public static String INFO = "Введите число в формате N.NNN:";
    public static String ERROR = "Такой операции нет!";

    public static String printInfo() {
        System.out.println(
                "Выеберите операцию над double/float:\n" +
                        "1. Сравнить\n" +
                        "2. Округлить\n" +
                        "3. Отбросить дробную часть");
        String input = scanner.nextLine();
        return input;
    }

    public static Boolean equalityOfNumbers(Double num1, Double num2) {
        return  (Math.abs(num2 - num1) < 0.00000001);
    }

    public static int roundingANumber(Double num) {
        return (int) Math.round(num);
    }

    public static int integerNumber(Double num) {
        return (int) num.longValue();
    }

}
