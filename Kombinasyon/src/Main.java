import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kombinasyon hesaplaması için C(n,r) değerlerini girmeniz gerekmektedir.");
        System.out.println("n Değerini Giriniz:");
        int n = scanner.nextInt();
        System.out.println("r Değerini Giriniz:");
        int r = scanner.nextInt();
        int nFact =1,rFact =1,n_rFact=1;

        for  (int i = 1; i <= n; i++) {
             nFact *= i ;
        }


        for (int j = 1; j <= r; j++) {
            rFact *= j ;
        }

        for (int k = 1; k <= (n-r); k++) {
            n_rFact *= k;
        }

        double result = nFact / rFact*n_rFact;
        System.out.println("C(" +n+","+r+") Kombinasyonu sonucu: "+result);
    }
}