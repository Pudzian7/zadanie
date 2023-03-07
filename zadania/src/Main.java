import InneKlasy.Sklep;
import InneKlasy.Kwiaciarnia;
import InneKlasy.DataUtils;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args)throws Exception {

        Sklep sklep = new Sklep("limanowskiego", 60, true, 2000);
        System.out.println(sklep);
        System.out.println("Liczba półek: " + sklep.liczIloscPolek());
        System.out.println("Czynsz za 9 miesięcy: " + sklep.obliczCzynsz(9) + " zł");

        Kwiaciarnia kwiaciarnia = new Kwiaciarnia("Kwiatowa", 60, true, 1400, 20);
        System.out.println(kwiaciarnia);

        LocalDate data1 = LocalDate.of(2006, 10, 15);
        LocalDate data2 = LocalDate.of(2013, 3, 02);
        int roznicaMiesiace = DataUtils.roznicaDatMiesiace(data1, data2);
        int roznicaDni = DataUtils.roznicaDatDni(data1, data2);
        LocalDate dataPoInterwale = DataUtils.dataPoInterwaleDni(data1, 10);

        System.out.println("Różnica  w miesiącach: " + roznicaMiesiace);
        System.out.println("Różnica  w dniach: " + roznicaDni);
        System.out.println("Data po interwale 10 dni od " + data1 + ": " + dataPoInterwale);


    }
}