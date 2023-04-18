// ��� ��������� ���, ��������� ��� ���, ��� ���������

import java.io.FileNotFoundException;

public class Task3 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("��������� �� ����� ��������� �� null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("������ ������� �� ������� ������ �������!");
        } catch (ArithmeticException ex) {
            System.out.println("�� ���� ������ ������!");
        } catch (FileNotFoundException ex) {
            System.out.println("���� �� ������!");
        } catch (Exception ex) {
            System.out.println("���-�� ����� �� ���...");
        }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }


}
