import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int num = scanner.nextInt();
        if (isPalindrom(num)) {
            System.out.println(num + " Palindrom Sayıdır.");
        }
        else {
            System.out.println(num + " Palindrom Sayı Değildir.");
        }
    }

    static boolean isPalindrom(int number) {
        int tempNumber = 0, orginalnumber = number;

        while (number != 0) {

            int digit = number % 10;
            tempNumber = tempNumber * 10 + digit;
            number /= 10;
        }

        return orginalnumber == tempNumber;

    }
}