import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int total=0;
        Scanner scanner = new  Scanner (System.in);
        System.out.print("Sayı Giriniz: ");
        int number=scanner.nextInt();
        String message;

        for (int i =1; i<number; i ++)
            if (number%i==0){
                total +=i;
            }

        message =(total==number ? number +" Mükemmel sayıdır." : number + " Mükemmel sayı değildir.");

        System.out.println(message);
    }
}