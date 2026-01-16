import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int process =0;
        double result =0;
        double a;
        double b;

        System.out.println("1. Sayıyı Giriniz:");
        a = scan.nextDouble();
        System.out.println("2. Sayıyı Giriniz:");
        b = scan.nextDouble();
        System.out.println("1-Toplama");
        System.out.println("2-Çıkarma");
        System.out.println("3-Çarpma");
        System.out.println("4-Bölme");
        process = scan.nextInt();

        switch (process) {
            case 1: result= a+b;
            break;
            case 2: result= a-b;
            break;
            case 3: result= a*b;

            break;

            case 4:
                if ( b==0)
                {
                    System.out.println("Sıfıra Bölme İşleme Yapılamaz");
                    break;
                }
                result= a/b;
                break;

    default:
    System.out.println("Hatalı Giriş Yaptınız");
        }
        System.out.println( "Sonuç:" + result);

    }
}