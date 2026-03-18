import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sysName="Abdullah Değirmenci";
        int userPassword,sysPassword =1, userId,sysId=1,choose,right=3;
        double balance = 1000;

        while (true){
            System.out.println("1-Kartınızı ATM'de işaretli alana okutunuz\n"+"2-Kartsız İşlem");
            System.out.print("İşlem Tipinizi Seçiniz: ");
            choose=scanner.nextInt();
            switch (choose) {
                case  1 : {
                    System.out.println("Kart Bilgileriniz Okunuyor...");
                    System.out.println("Hoşgeldiniz " + sysName + " İşlem yapmak için Şifrenizi Giriniz:");
                    while (right > 0) {
                        System.out.print("Parolanızı Giriniz: ");
                        userPassword = scanner.nextInt();

                        if (userPassword == sysPassword) {
                            while(choose!=4){
                            System.out.println("1-Para yatırma\n" +
                                    "2-Para Çekme\n" +
                                    "3-Bakiye Sorgula\n" +
                                    "4-Çıkış Yap");
                            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                            choose = scanner.nextInt();

                            switch (choose) {
                                case 1: {
                                    System.out.print("Yatırılacak tutarı giriniz: ");
                                    int price = scanner.nextInt();
                                    balance += price;
                                    System.out.println("Para yatırma işleminiz gerçekleşmiştir. Güncel bakiyeniz: " + balance +"\n");
                                    break;
                                }
                                case 2: {
                                    System.out.print("Çekilecek tutarı giriniz: ");
                                    int price = scanner.nextInt();
                                    if (price > balance) {
                                        System.out.println("Çekebileceğiniz maksimum tutar: " + balance  +"\n");
                                    } else {
                                        balance -= price;
                                        System.out.println("Para çekme işleminiz gerçekleşmiştir. Güncel bakiyeniz: " + balance  +"\n");
                                    }
                                    break;

                                }
                                case 3: {
                                    System.out.println("Güncel bakiyeniz: " + balance);
                                    break;
                                }
                                case 4: {
                                    System.out.println("Çıkış Yapılıyor\n" + "Sağlıklı Günler Dileriz...");
                                    break;
                                }


                            }
                        }
                        break;

                        } else {
                            --right;
                            System.out.println("Hatalı Giriş Yaptınız. Tekrar Deneyiniz. Kalan Giriş Hakkınız: " + right);
                        }

                    }

                    break;
                }

                case 2:

                    while (right>0){
                        System.out.print("Kimlik Numaranızı Giriniz: ");
                        userId = scanner.nextInt();
                        System.out.print("Parolanızı Giriniz: ");
                        userPassword = scanner.nextInt();

                        if (userId==sysId && userPassword==sysPassword){

                            System.out.println("Hoşgeldiniz " + sysName + "\n");
                            while(choose!=4){
                                System.out.println("1-Para yatırma\n" +
                                        "2-Para Çekme\n" +
                                        "3-Bakiye Sorgula\n" +
                                        "4-Çıkış Yap");
                                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                                choose = scanner.nextInt();

                                switch (choose) {
                                    case 1: {
                                        System.out.print("Yatırılacak tutarı giriniz: ");
                                        int price = scanner.nextInt();
                                        balance += price;
                                        System.out.println("Para yatırma işleminiz gerçekleşmiştir. Güncel bakiyeniz: " + balance  +"\n");
                                        break;
                                    }
                                    case 2: {
                                        System.out.print("Çekilecek tutarı giriniz: ");
                                        int price = scanner.nextInt();
                                        if (price > balance) {
                                            System.out.println("Çekebileceğiniz maksimum tutar: " + balance +"\n");
                                        } else {
                                            balance -= price;
                                            System.out.println("Para çekme işleminiz gerçekleşmiştir. Güncel bakiyeniz: " + balance +"\n");
                                        }
                                        break;

                                    }
                                    case 3: {
                                        System.out.println("Güncel bakiyeniz: " + balance);
                                        break;
                                    }
                                    case 4: {
                                        System.out.println("Çıkış Yapılıyor\n" + "Sağlıklı Günler Dileriz...");
                                        break;
                                    }


                                }
                            }
                        }
                        else {
                            --right;
                            System.out.println("Hatalı Giriş Yaptınız. Tekrar Deneyiniz. Kalan Giriş Hakkınız: " +right);
                        }

                    }


            }
    break;
        }




    }
}