import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String sepet[] = {"Armut","Elma","Domates","Muz","Patlıcan"};
        double fiyatlar[] = {2.14,3.67,1.11,0.95,5.00};
        double kilo [] ={0.0,0.0,0.0,0.0,0.0};
        double toplam = 0;

        for (int i = 0; i<sepet.length;i++){
            System.out.println(sepet[i] + " İçin Alınan Kiloyu Giriniz");
            kilo[i]= scanner.nextDouble();
            toplam +=   fiyatlar[i] * kilo[i];

        }
        System.out.println("Toplam Tutar:" +toplam);

    }
}