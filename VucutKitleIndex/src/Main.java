import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height, weight, result;
        System.out.println("Lütfen boyunuzu metre cinsinden giriniz: ");
        height = sc.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        weight = sc.nextDouble();
        result = weight / (height * height);
        System.out.println("Vücut Kitle İndeksiniz: " +result);
    }
}