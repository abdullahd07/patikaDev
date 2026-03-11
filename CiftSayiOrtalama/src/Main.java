import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Sayı Giriniz...");
        int a = scanner.nextInt();
        int toplam =0, uygunSayi =0;
        double sonuc;


        for  (int i = 0; i <= a; i++) {
            if (i%12 == 0) {
                toplam += i;
                uygunSayi++;
            }
        }

        sonuc = toplam / uygunSayi;

        System.out.println("Girmiş olduğunuz" + a + " değerine kadar 3'e ve 4'e bölünebilen sayıların ortalaması: " + sonuc);


    }
}