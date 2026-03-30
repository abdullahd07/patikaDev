public class Main {

    static boolean isPalindrome(int number) {

        if (number < 0) return false; // negatif sayılar palindrom kabul edilmez

        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        int number = 12321;

        System.out.println("Girilen sayı: " + number);

        if (isPalindrome(number)) {
            System.out.println(number + " palindrom sayıdır.");
        } else {
            System.out.println(number + " palindrom sayı değildir.");
        }
    }
}