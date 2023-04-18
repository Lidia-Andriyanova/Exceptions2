// Исправьте код, примените подходящие способы обработки исключений:

import java.io.*;
import java.nio.file.FileAlreadyExistsException;

public class Task4 {
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            String[] strings = {"apple", "orange"};
            String strings1 = strings[2];
            test();
            int a = 1 / 0;
            inputStream = new FileInputStream("/broken_reference");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("На ноль делить нельзя");
        }  catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Указатель не может указывать на null");
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Массив выходит за пределы своего размера");
        } catch (FileAlreadyExistsException e) {
            e.printStackTrace();
            System.out.println("Файл уже существует");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Файл не существует");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка ввода/вывода");
        } catch (StackOverflowError e) {
            System.out.println("Что-то сломалось");
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e) {
                    System.out.println("Файл не закрылся");
                }
            }
            System.out.println("Я все равно выполнился");
        }
        System.out.println("Я жив!");
    }

    private static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
    }
}
