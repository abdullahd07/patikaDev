import  java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double result , number, number2 = 0;
        int product ;

        System.out.print("Sayı giriniz: ");
        number = scanner.nextInt();

        result = number;

        while (true) {

            System.out.print(
                      "\n1-Topla"
                    + "\n2-Çıkar"
                    + "\n3-Çarp"
                    + "\n4-Böl"
                    + "\n5-Üs Al"
                    + "\n6-Faktöriyel"
                    + "\n7-Mod Al"
                    + "\n9-Temizle"
                    + "\n0-Çıkış"
                    + "\nMevcut Değer: " +result +" İşlem Seçiniz:"
            );
            product=scanner.nextInt();

            if (product == 9) {

                System.out.print("Yeni sayı giriniz: ");
                result = scanner.nextInt();
                continue;
            }
            else if (product==0) {
                    System.out.println("Son Değer:" + result +"\nÇıkış Yapılıyor.");
                    break;
                }

            if (product!=6) {
                System.out.print("Sayı giriniz: ");
                number2 = scanner.nextInt();
            }




            switch (product) {
                case 1:
                    result=sum(result,number2);
                    System.out.println("Sonuç:" + result);
                    break;
                case 2:
                    result=minus(result,number2);
                    System.out.println("Sonuç:" + result);
                    break;
                case 3:
                    result = multiply(result,number2);
                    System.out.println("Sonuç: " +result);
                    break;
                case 4:
                    result = divide(result,number2);
                    System.out.println("Sonuç: " +result);
                    break;
                case 5:
                    result = power(result,number2);
                    System.out.println("Sonuç: " +result);
                    break;
                case 6:
                    result = factorial(result);
                    System.out.println("Sonuç: " +result);
                    break;
                case 7:
                    result = mod(result,number2);
                    System.out.println("Sonuç: " +result);
                    break;
                case 8 :
                    result = rectangle(result,number2);
                    break;
            }


        }
    }


    static  double sum (double number1,double number2)  {
        return  number1+number2;
    }

    static  double minus (double number1, double number2)  {
        return  number1-number2;
    }
    static  double multiply (double number1,double number2)  {
        return  number1*number2;
    }

    static  double divide (double number1,double number2)  {
        if (number2==0){
            System.out.println("Sıfıra Bölme İşlemi yapılamaz!");
            return number1;
        }
        else {
            return number1 / number2;
        }
    }

    static double power (double number1,double number2){
        double result=1;
        if (number2== 0)
        {
            return  1;
        }
        for (int i=1; i<= number2; i ++)
        {
            result *= number1;
        }

        return result;
    }

    static double factorial (double number1){
    int result = 1;

        for (int i = 1; i <= number1; i++) {
        result *= i;
    }
        System.out.println("Sonuç : " + result);
        return result;
    }

    static double mod(double number1,double number2){
        return number1%number2;
    }

    static double rectangle (double number1,double number2){

        System.out.println("Dikdörtgenin alanı : " + number1 * number2);
        System.out.println("Dikdörtgenin çevresi : " + 2 * (number1 + number2));
        return number1 * number2;
    }

}