import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {15.3, 12.5, -23.1, 34.0, -23.5,
                12.4, 5.3, 23.5, -14.3, -4.1, 2.0, -1.2, 7.2, -45.1, 32.1};
        double sum = 0;
        int quantity = 0;
        boolean isThisFirstNegative = false;
        for (double element : numbers) {
            if (isThisFirstNegative) {
                if (element > 0) {
                    sum += element;
                    quantity++;
                }
            }else if (element < 0) {
                isThisFirstNegative = true;
            }
        }
        if (quantity > 0) {
            double average = sum / quantity;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного числа: " + average);
        } else {
            System.out.println("Положительные числа после первого отрицательного числа не найдены");
        }
    }
}