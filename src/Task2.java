// Если необходимо, исправьте данный код

public class Task2 {
    public static void main(String[] args) {

        int[] array1 = null;
        Calculate(array1);

        int[] array2 = {1, 2, 3};
        Calculate(array2);

        int[] array3 = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        Calculate(array3);
    }

    public static void Calculate(int[] intArray) {
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (NullPointerException | ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (Exception e) {
            System.out.println("Unknown exception: " + e);
        }
    }
}
