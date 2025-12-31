import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double radius,area,girt,a,circleSliceArea;
    final double pi=3.14;

        System.out.println("Yarıçap giriniz");
        radius = scan.nextDouble();
        System.out.println("Alan hesabı istenen açıyı giriniz: ");
        a = scan.nextDouble();
        girt= 2*pi*radius;
        area = pi*radius*radius;
        circleSliceArea= (pi * ( area * area)* a) / 360;
        System.out.println("Dairenin Çevresi: " +girt);
        System.out.println("Dairenin Alanı: " +area);
        System.out.println("Daire Dilim Alanı: " +circleSliceArea);

    }
}