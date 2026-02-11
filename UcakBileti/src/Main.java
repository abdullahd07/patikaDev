import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int distance,age,type=0;
        double price,perKmPrice  =0.1;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi Kilometre Cinsinden Giriniz : ");
        distance = input.nextInt();
        System.out.print("Yaşınızı Giriniz : ");
        age = input.nextInt();
        System.out.println("Yolculuk Tipinizi Giriniz : (1 => Tek Yön, 2 => Gidiş-Dönüş)");
        type = input.nextInt();
        price = distance*perKmPrice;
        if (type == 1 || type ==2){


                if (age >= 0) {
                    if (age < 12) {
                        price = price - price * 0.5;
                    } else if (age >= 12 && age <= 24) {

                        price = price - price * 0.1;
                    } else if (age > 65) {

                        price = price - price * 0.3;
                    }

                    if (type == 2){

                        price = price - price * 0.2;
                    }


                    System.out.println(price);
                }
                else {
                    System.out.println("Hatalı Yaş Girdiniz.");
                }

        }
        else {
            System.out.println("Yolculuk Tipini Hatalı Girdiniz");
        }

    }
}