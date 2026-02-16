import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Doğum tarihinizi GG.AA.YYYY formatında giriniz.");
        String birthday = scan.nextLine();

        System.out.println(birthday);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        try {
            LocalDate birthDate = LocalDate.parse(birthday, formatter);

            int day =birthDate.getDayOfMonth();
            int month = birthDate.getMonthValue();
            int year = birthDate.getYear();

            int zodiacYear = year%12;
            String zodiac="";
            String horoscope ="";

            switch (zodiacYear) {
                case 0:
                    zodiac="Maymun";
                    break;
                case 1:
                    zodiac="Horoz";
                    break;
                case 2:
                    zodiac="Köpek";
                    break;
                case 3:
                    zodiac="Domuz";
                    break;
                case 4:
                    zodiac="Fare";
                    break;
                case 5:
                    zodiac="Öküz";
                    break;
                case 6:
                    zodiac="Kaplan";
                    break;
                case 7:
                    zodiac="Tavşan";
                    break;
                case 8:
                    zodiac="Ejderha";
                    break;
                case 9:
                    zodiac="Yılan";
                    break;
                case 10:
                    zodiac="At";
                    break;
                case 11:
                    zodiac="Koyun";
                    break;
            }

            switch (month)
            {
                case 1:
                    horoscope = day <= 21 ? "Oğlak" : "Kova";
                    break;
                case 2:
                    horoscope = day <= 19 ? "Kova" : "Balık";
                    break;
                case 3:
                    horoscope = day <= 20 ? "Balık" : "Koç";
                    break;
                case 4:
                    horoscope = day <= 20 ? "Koç" : "Boğa";
                    break;
                case 5:
                    horoscope = day <= 21 ? "Boğa" : "İkizler";
                    break;
                case 6:
                    horoscope = day <= 22 ? "İkizler" : "Yengeç";
                    break;
                case 7:
                    horoscope = day <= 22 ? "Yengeç" : "Aslan";
                    break;
                case 8:
                    horoscope = day <= 21 ? "Aslan" : "Başak";
                    break;
                case 9:
                    horoscope = day <= 21 ? "Başak" : "Terazi";
                    break;
                case 10:
                    horoscope = day <= 22 ? "Terazi" : "Akrep";
                    break;
                case 11:
                    horoscope = day <= 21 ? "Akrep" : "Yay";
                    break;
                case 12:
                    horoscope = day <= 22 ? "Yay" : "Oğlak";
                    break;
                default:
                    horoscope = "Geçersiz";
                    break;



            }


            System.out.println( "Çin Burcunuz: "+zodiac +" Astrolojide Burcunuz: " + horoscope);

        }
        catch (DateTimeParseException e) {
            System.out.println("Hatalı tarih girişi yaptınız.");
        }


    }
}