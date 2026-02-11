import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Doğum Tarihinizi GG.AA.YYYY olacak şekilde giriniz.");

        String birthday = input.nextLine();
        int month = Integer.parseInt(birthday.substring(3, 5));
        int day = Integer.parseInt(birthday.substring(0, 2));
        String message = "Burcunuz: ";

        if (month >= 1 && month <= 12 && day >= 1 && day <= 31)
        {
            if (month == 1 ){
                if (day <= 21){
                    System.out.println(message + "Oğlak");
                }
                else {
                    System.out.println(message + "Kova");
                }
                }
            else if (month == 2){
                if (day <= 19){
                    System.out.println(message + "Kova");
                }
                else {
                    System.out.println(message + "Balık");
                }
            }
            else if (month == 3){
                if (day <= 20){System.out.println(message + "Balık");
                }
                else {
                    System.out.println(message + "Koç");
                }
            }
            else if (month == 4){
                if (day <=20) {
                    System.out.println(message + "Koç");
                }
                else {
                    System.out.println(message + "Boğa");
                }


            }
            else if (month == 5){
                if (day <=21) {
                    System.out.println(message + "Boğa");
                }
                else {
                    System.out.println(message + "İkizler");
                }
            }

            else if (month == 6){
                if (day <=22) {
                    System.out.println(message + "İkizler");
                }
                else {
                    System.out.println(message + "Yengeç");
                }
            }
            else if (month == 7){
                if (day <=22) {
                    System.out.println(message + "Yengeç");
                }
                else {
                    System.out.println(message + "Aslan");
                }
            }
            else if (month == 8){
                if (day <=21) {
                    System.out.println(message + "Aslan");
                }
                else {
                    System.out.println(message + "Başak");
                }
            }
            else if (month == 9){
                if (day <=21) {
                    System.out.println(message + "Başak");
                }
                else {
                    System.out.println(message + "Terazi");
                }
            }
            else if (month == 10){
                if (day <=22) {
                    System.out.println(message + "Terazi");
                }
                else {
                    System.out.println(message + "Akrep");
                }
            }
            else if (month == 11){
                if (day <21) {
                    System.out.println(message + "Akrep");
                }
                else {
                    System.out.println(message + "Yay");
                }
            }
            else {
                if (day <=22) {
                    System.out.println(message + "Yay");
                }
                else {
                    System.out.println(message + "Oğlak");
                }
            }
        }
        else {
            System.out.println("Hatalı giriş yaptınız!");
        }
    }
}
