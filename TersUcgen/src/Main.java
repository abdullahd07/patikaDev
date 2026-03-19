import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç basamaklı ters üçgen oluşturmak istersiniz? \nDeğer Giriniz: ");
        int number = scanner.nextInt();

        for (int  i =number; i>=0; i--) {

            for (int j=number; j>i; j --){
                System.out.print(" ");
            }

            for (int k =0; k < (i*2)-1; k++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}