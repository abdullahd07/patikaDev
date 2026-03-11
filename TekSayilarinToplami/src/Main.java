import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Sayı Giriniz...");
        int toplam = 0;
        while(true){
            int sayi = scanner.nextInt();
            if (sayi%2==0 || sayi%4 == 0){
                toplam += sayi;
            }

            if (sayi%2!=0){
                System.out.println("Tek sayı girildi çıkış yapılıyor.");
                System.out.println("Girilen değerleden 2 veya 4 katları olan sayıların toplamı: "+toplam);
                break;
            }
        }

    }
}