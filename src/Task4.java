// ��������� ���, ��������� ���������� ������� ��������� ����������:

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
            System.out.println("�� ���� ������ ������");
        }  catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("��������� �� ����� ��������� �� null");
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("������ ������� �� ������� ������ �������");
        } catch (FileAlreadyExistsException e) {
            e.printStackTrace();
            System.out.println("���� ��� ����������");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("���� �� ����������");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("������ �����/������");
        } catch (StackOverflowError e) {
            System.out.println("���-�� ���������");
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e) {
                    System.out.println("���� �� ��������");
                }
            }
            System.out.println("� ��� ����� ����������");
        }
        System.out.println("� ���!");
    }

    private static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
    }
}
