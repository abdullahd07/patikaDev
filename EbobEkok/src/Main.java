import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number1, number2,ebob=1,i=1;
        System.out.print("1.sayıyı giriniz: ");
        number1=scanner.nextInt();
        System.out.print("2.sayıyı giriniz: ");
        number2 =scanner.nextInt();


        int lowerNumber = (number1 <= number2)? number1:number2;


        while (i<lowerNumber){

            if (number1 %i==0 && number2 %i==0){
                ebob =i;
            }
            i++;
        }

        int ekok = (number1 >= number2) ? number1:number2;

        while (true){
            if (ekok % number1 == 0 && ekok % number2 == 0) {
                System.out.println("Ekok: " + ekok);
                break;
            }
            ekok++;
        }

        System.out.println("Ebob:"+ebob);
        System.out.println("Ekok:"+ekok);
    }
}