import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner   =new Scanner(System.in);
        String dersler[] = {"Matematik","fizik","turkce","kimya","muzik"};
        int total =0;
        int avarage =0;

        for (int i=0;i<dersler.length;i++){
            while (true){
            System.out.println(dersler[i]+" notunuzu giriniz:");
            int girilenNot = scanner.nextInt();


                    if (girilenNot>=0 && girilenNot<=100){
                        total+=girilenNot;
                        break;
                    }
                    else {
                        System.out.println(dersler[i]+" için hatalı giriş yaptınız 0-100 arasında notunuzu giriniz:");
                    }
                }

        }
        avarage=total / dersler.length;

        System.out.println("Ortalamanız: " + avarage + " - " +(avarage >55 ? "Geçtiniz" : "Kaldınız"));


    }
}
