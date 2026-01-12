import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double workHours,pricePerHour,workTime,kdv,excludeKdv,inculudeKdv,result,totalKdv;
        kdv=0.20;

        System.out.println("Çalışılan Süreyi Giriniz: ");
        workHours=sc.nextDouble();
        System.out.println("Günlük çalışma saatini giriniz:");
        workTime=sc.nextDouble();
        System.out.println("Saatlik Ücreti Giriniz:");
        pricePerHour= sc.nextDouble();

        excludeKdv= workHours/workTime * pricePerHour;
        totalKdv = excludeKdv *kdv;
        inculudeKdv = excludeKdv - (excludeKdv * kdv);


        System.out.println("KDV Hariç Tutar: " +excludeKdv);
        System.out.println("KDV Tutar: " +totalKdv);
        System.out.println("KDV Dahil Tutar: " +inculudeKdv);



    }
}
