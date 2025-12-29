import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner =new Scanner(System.in);
        double tutar,kdvOran, kdvTutar, kdvDahilTutar;

        System.out.println("Tutarı Giriniz");
        tutar= scanner.nextDouble();
        if  (tutar<=1000){
            kdvOran=0.18;
        }
        else{
            kdvOran=0.8;
        }

        kdvTutar=tutar*kdvOran;
        kdvDahilTutar=tutar+kdvTutar;


        System.out.println("Kdv'siz Tutar:" + tutar);
        System.out.println("Kdv Tutar:" + kdvTutar);

        System.out.println("Kdv Dahil:" + kdvDahilTutar);
    }
}