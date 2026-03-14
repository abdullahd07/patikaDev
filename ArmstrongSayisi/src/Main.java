import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hesaplanacak Sayıyı Giriniz: ");
        int number = scanner.nextInt();
        int temp = number, digitCount = 0, sum = 0;

        //basamak sayısını bulma
        while (temp != 0) {
            digitCount++;
            temp  /= 10;
        }

        temp = number;

        //her basamaktaki sayıya göre kuvvet bulma
        while (temp != 0) {

            int digit = temp % 10;

            int power = 1;

            for (int i = 0; i < digitCount; i++) {
                power = power * digit;
            }

            sum +=  power;
            temp = temp / 10;
        }


        if(sum == number){
            System.out.println(number +" Armstrong Sayısıdır.");
        }
        else
            System.out.println(number + " Armstrong sayısı değildir.");

    }
}

