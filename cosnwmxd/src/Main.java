import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import InneKlasy.Działania;
import InneKlasy.Kwiaciarnia;
import InneKlasy.Sklep;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        String adresSklepu = "plażowa";
        int powierzchnia = 11;
        boolean czyJestWc = true;
        int czynsz = 1000;
        int powierzchniaZaplecza = 3;

        Sklep sklepik = new Sklep(adresSklepu, powierzchnia, czyJestWc, czynsz);
        System.out.println(sklepik.toString());
        System.out.println(sklepik.lPolek());
        System.out.println(sklepik.Final(12));
        System.out.println();
        Kwiaciarnia kwiaciarnia = new Kwiaciarnia(adresSklepu, powierzchnia, czyJestWc, czynsz, powierzchniaZaplecza);
        System.out.println(kwiaciarnia.toString());
        System.out.println(kwiaciarnia.lPolek());




        System.out.println("Podaj date");

        String date = myObj.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date2=null;
        try {

            date2 = dateFormat.parse(date);
        } catch (ParseException e) {

            e.printStackTrace();
        }
        System.out.println(date2);

        System.out.println("Podaj drugą date");

        String dateDruga = myObj.next();
        Date dateDruga2=null;
        try {

            dateDruga2 = dateFormat.parse(dateDruga);
        } catch (ParseException e) {

            e.printStackTrace();
        }
        System.out.println(dateDruga2);

        Działania działania = new Działania();

        System.out.println(działania.rozDat(date2, dateDruga2));




    }
}