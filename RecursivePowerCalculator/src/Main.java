import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int number1,number2;
        System.out.print ("Taban sayısını giriniz: ");
        number1=scanner.nextInt();
        System.out.print ("Üs Değerini giriniz: ");
        number2=scanner.nextInt();
        System.out.println(power(number1,number2));

    }

    static int power (int number1,int number2){

        if (number2==0){
            return 1;
        }
        return number1*power(number1,number2-1);


    }
}