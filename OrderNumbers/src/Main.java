import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c,temp;
        System.out.println("1. Sayıyı Giriniz:");
        a = scanner.nextInt();
        System.out.println("2. Sayıyı Giriniz:");
        b = scanner.nextInt();
        System.out.println("3. Sayıyı Giriniz:");
        c = scanner.nextInt();

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }

        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println(a + " < " + b + " < " + c);

    }
}