import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.print("Sayı Giriniz:");
        int number = scanner.nextInt();
        int temp = number;

// Azalma
        while (temp > 0) {
            System.out.print(temp + " ");
            temp -= 5;
        }

        System.out.print(temp + " ");


// Artma
        while (temp < number) {
            temp += 5;
            System.out.print(temp + " ");
        }

        System.out.println();
        recursivePattern(number, number, true);

    }

    static void recursivePattern(int current, int original, boolean isDecreasing) {

        System.out.print(current + " ");

        // Azalma
        if (isDecreasing) {
            if (current - 5 > 0) {
                recursivePattern(current - 5, original, true);
            } else {

                recursivePattern(current - 5, original, false);
            }
        }
        // Artma
        else {
            if (current < original) {
                recursivePattern(current + 5, original, false);
            }
        }
    }
}