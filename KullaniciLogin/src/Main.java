import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String name,activePassword,inputPassword,newPassword;
        int process;
        name="test";

        activePassword = "123";
        System.out.println(name + " Kullanıcısı için şifre giriniz");
        inputPassword=scanner.nextLine();

        if(inputPassword.equals(activePassword)){
            System.out.println("Giriş başarılı");
        }

        else {
            System.out.println("Hatalı şifre girdiniz!");
            System.out.println("1-Şifre sıfırlama");
            System.out.println("2-Çıkış");
            process=scanner.nextInt();

            switch (process){
                case 1:
                    System.out.println("Yeni şifrenizi giriniz:");
                    scanner.nextLine();

                    while (true) {
                        newPassword=scanner.next();
                        if (newPassword.equals(activePassword)) {
                            System.out.println("Yeni şifreniz son 3 şifreniz ile aynı olamaz! Yeni şifrenizi Giriniz.");
                            scanner.nextLine();
                        }
                        else {
                            System.out.println("Şifreniz başarıyla güncellendi!");
                            break;
                        }
                    }
                    break;
                case  2:
                    System.out.println("Çıkış yapılıyor!");
                    break;

                    default:  System.out.println("Çıkış yapılıyor!");break;

            }
            }
        }



    }