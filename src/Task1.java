import java.util.Scanner;

//    1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//    и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
//    вместо этого, необходимо повторно запросить у пользователя ввод данных.

public class Task1 {
    public static void main(String[] args) {
        inputFloat();
    }

    public static void inputFloat() {
        try {
            Scanner scanner = new Scanner(System.in);
            float num;

            while (true) {
                try {
                    System.out.print("Введите дробное число: ");
                    if (!scanner.hasNextFloat()) {
                        throw new IllegalArgumentException("Ошибка ввода дробного числа");
                    }

                    num = scanner.nextFloat();
                    break;

                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    scanner.next();
                }
            }
            System.out.format("Введено дробное число: %f \n", num);
        } catch (Exception e) {
            System.out.println("Неизвестная ошибка: " + e.getMessage());
        }
    }


}