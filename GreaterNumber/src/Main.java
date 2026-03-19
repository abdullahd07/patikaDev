import  java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number=0;
        int greaterNumber=0;
        int lowerNumber=Integer.MAX_VALUE;
        int count=0;

        System.out.print("Kaç sayı gireceksiniz? :");
        count =scanner.nextInt();

        for ( int i =1; i <= count; i++){
            System.out.print(i+". Sayıyı Giriniz: ");
            number=scanner.nextInt();

            greaterNumber= (number>=greaterNumber)? number : greaterNumber;

            lowerNumber = (number<= lowerNumber)? number:lowerNumber;

        }

        System.out.println("En büyük sayı: " + greaterNumber);
        System.out.println("En küçük sayı: " + lowerNumber);

    }
}