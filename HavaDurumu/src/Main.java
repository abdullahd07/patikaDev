import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklığı giriniz: ");
        int sicaklik = input.nextInt();

        int kategori;

        if (sicaklik < 5) {
            kategori = 1;
        } else if (sicaklik <= 15) {
            kategori = 2;
        } else if (sicaklik <= 25) {
            kategori = 3;
        } else {
            kategori = 4;
        }

        switch (kategori) {
            case 1:
                System.out.println("Kayak yapabilirsiniz.");
                break;
            case 2:
                System.out.println("Sinema etkinliği önerilir.");
                break;
            case 3:
                System.out.println("Piknik yapabilirsiniz.");
                break;
            case 4:
                System.out.println("Yüzme etkinliği önerilir.");
                break;
        }
    }


  }
