import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner (System.in);

        System.out.println("Sayı Giriniz:");
        int value = scanner.nextInt();

        for (int i =1 ; i<=value; i *=4)
        {
            if (i==1){
                continue;
            }
            System.out.println(i);
        }


        for (int i =1 ; i<=value; i *=5)
        {
            if (i==1){
                continue;
            }
            System.out.println(i);
        }
    }
}