import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення границ проміжку
        System.out.print("Введіть початкову границю проміжку: ");
        double start = scanner.nextDouble();
        System.out.print("Введіть кінцеву границю проміжку: ");
        double end = scanner.nextDouble();

        // Початкове значення аргумента функції
        double step = 0.2;
        double x = start;
        int count = 0;

        // Цикл протабулювання функції та підрахунку кількості значень в діапазоні
        while (x <= end) {
            double result = Math.pow(x, 5) - x + 1.8;
            if (result >= start && result <= end) {
                count++;
            }
            x += step;
        }

        // Виведення результату
        if (count > 0) {
            System.out.println("Кількість значень функції у заданому діапазоні: " + count);
        } else {
            System.out.println("Немає значень функції у заданому діапазоні.");
        }
    }
}