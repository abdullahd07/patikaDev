import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double km,perKm,startPrice,minPrice,totalPrice;

    perKm =2.2;
    startPrice =10;
    minPrice =20;

    System.out.println("Gidilen Km bilgisini giriniz:");
    km = input.nextDouble();

    totalPrice=startPrice+ km * perKm ;

    if(totalPrice< minPrice){
        totalPrice=minPrice;
    }
        System.out.println("Taksimetre Tutarı:" + totalPrice);
    }
}