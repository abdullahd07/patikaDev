import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double a, b,c,alan,cevre;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci Kenar Uzunluğunu Giriniz:");
        a = scanner.nextDouble();
        System.out.println("İkinci Kenar Uzunluğunu Giriniz:");
        b = scanner.nextDouble();
        System.out.println("Üçüncü Kenar Uzunluğunu Giriniz:");
        c = scanner.nextDouble();

        cevre= (a+b+c)/2;
        if (a >0 && b>0 && c>0)
            {
            alan = cevre * (cevre -a) * (cevre -b) * (cevre -c);
            System.out.println("Üçgenin alanı: " + alan);
            }
        else
            System.out.println("Girilen değerler 0'dan büyük olmalıdır! Hesaplama yapılamadı.");

    }
}