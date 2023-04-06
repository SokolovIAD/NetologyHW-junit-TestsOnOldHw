
public class Main extends Methods {
    public static void main(String[] args) {
        while (true) {
            switch (printInfo()) {
                case "1":
                    System.out.println(INFO);
                    Double num1 = Double.parseDouble(scanner.nextLine());
                    System.out.println(INFO);
                    Double num2 = Double.parseDouble(scanner.nextLine());
                    if ((equalityOfNumbers(num1, num2))) {
                        System.out.println("Числа равны!");
                    } else {
                        System.out.println("Числа не равны!");
                    }
                    break;
                case "2":
                    System.out.println(INFO);
                    Double num3 = Double.parseDouble(scanner.nextLine());
                    System.out.println("Округленное число: " + roundingANumber(num3));
                    break;
                case "3":
                    System.out.println(INFO);
                    Double num4 = Double.parseDouble(scanner.nextLine());
                    System.out.println("Число без дробной части:" + integerNumber(num4));
                    break;
                default:
                    System.out.println(ERROR);
                    break;
            }
        }
    }
}




