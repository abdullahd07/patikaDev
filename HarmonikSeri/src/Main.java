import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz:");
        int number = scan.nextInt();
        double result = 0;
        for (double i = 1; i <= number; i++) {
            result += (1/ i);
        }
        System.out.println(number + " için Harmonik Seri değeri: "+ result +" olarak hesaplanmaktadır.");
    }
}