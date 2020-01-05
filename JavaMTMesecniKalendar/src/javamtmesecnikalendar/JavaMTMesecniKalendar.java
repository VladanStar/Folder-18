package javamtmesecnikalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class JavaMTMesecniKalendar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite mesec i godinu kalendara: ");
        int mesec = input.nextInt();
        int godina = input.nextInt();

        GregorianCalendar kalendar = new GregorianCalendar();
        int brojDana = 0;

        switch (mesec) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                brojDana = 31;
                break;
            case 2:
                if (kalendar.isLeapYear(godina)) {
                    brojDana = 29;
                } else {

                    brojDana = 28;
                }

                break;
            case 4:
            case 6:
            case 9:
            case 11:
                brojDana = 30;
                break;
            default:
                System.out.println("Pogresna specifikacija meseca");
                System.exit(-1);

        }
        kalendar.set(godina, mesec - 1, 1);
        int prviDan = kalendar.get(Calendar.DAY_OF_WEEK);

        System.out.println(" PON UTO SRE CET PET SUB NED");

        int k = 0;
        for (int i = Calendar.MONDAY; i < Calendar.SUNDAY; i++) {
            if (prviDan == 1) {
                break;
            }
            System.out.println("   ");
            k++;
        }
        for (int d = 1; d <= brojDana; d++) {
            System.out.printf("%5d", d);
            k++;
            if (k == 7) {
                System.out.println();
                k = 0;

            }
        }

        System.out.println();

    }

}
