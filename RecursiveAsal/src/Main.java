import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " asal sayıdır.");
        } else {
            System.out.println(number + " asal değildir.");
        }


    }

    static boolean isPrime(int n) {
        return isPrimeControl(n, 2);
    }

    static boolean isPrimeControl(int n, int i) {

        if (n <= 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % i == 0) {
            return false;
        }

        if (i * i > n) {
            return true;
        }

        return isPrimeControl(n, i + 1);
    }
}