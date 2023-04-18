import java.util.Scanner;

//    1. ���������� �����, ������� ����������� � ������������ ���� �������� ����� (���� float),
//    � ���������� ��������� ��������. ���� ������ ������ ����� �� ������ ��������� � ������� ����������,
//    ������ �����, ���������� �������� ��������� � ������������ ���� ������.

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
                    System.out.print("������� ������� �����: ");
                    if (!scanner.hasNextFloat()) {
                        throw new IllegalArgumentException("������ ����� �������� �����");
                    }

                    num = scanner.nextFloat();
                    break;

                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    scanner.next();
                }
            }
            System.out.format("������� ������� �����: %f \n", num);
        } catch (Exception e) {
            System.out.println("����������� ������: " + e.getMessage());
        }
    }


}