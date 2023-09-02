import java.util.Scanner;

public class Main {
// //////////////////////// ЗАДАЧИ 1 и 2 : ////////////////////////////////
//    public static float requestFloatInput() {
//        Scanner scanner = new Scanner(System.in);
//        float result;
//
//        while (true) {
//            System.out.print("Введите дробное число: ");
//            try {
//                result = Float.parseFloat(scanner.nextLine());
//                return result;
//            } catch (NumberFormatException e) {
//                System.out.println("Это не дробь. Попробуйте снова.");
//            }
//        }
//    }
//
//    public static void Task() {
//        float userInput = requestFloatInput();
//        System.out.println("Вы ввели: " + userInput);
//
//        int[] intArray = {1, 2, 3, 4, 5};  // Пример массива
//
//        try {
//            int d = 0;
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { // Добавил исключение выхода за пределы массива
//            System.out.println("Catching exception: " + e);
//        }
//    }
//
//    public static void main(String[] args) {
//        Task();
//    }
 /////////////////////////////////////////////////////////////////

 /////////ЗАДАЧА 3////////////////////
//
//    public static void main(String[] args) {
//        try {
//            int a = 90;
//            int b = 3;
//            System.out.println(a / b);
//            printSum(23, 234);
//            int[] abc = { 1, 2 };
//            abc[3] = 9;
//        } catch (NullPointerException ex) {
//            System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        } catch (Throwable ex) {
//            System.out.println("Что-то сломалось.");
//        }
//    }
//
//    public static void printSum(Integer a, Integer b) {
//        System.out.println(a + b);
//    }
///////////////////////////////////////////////////////////////////////////////////
//    ЗАДАЧА 4

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите строку: ");
            String input = scanner.nextLine();

            if (input.trim().isEmpty()) {
                throw new IllegalArgumentException("Пустые строки нельзя вводить!");
            }

            System.out.println("Вы ввели: " + input);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
