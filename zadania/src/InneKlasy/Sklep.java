package InneKlasy;
public class Sklep {
    public String adres;
    public double powierzchnia;
    public boolean czyJestWc;
    public double czynszNajmu;


    public Sklep(String adres, double powierzchnia, boolean czyJestWc, double czynszNajmu) {
        this.adres = adres;
        this.powierzchnia = powierzchnia;
        this.czyJestWc = czyJestWc;
        this.czynszNajmu = czynszNajmu;
    }


    @Override
    public String toString() {
        String wc = czyJestWc ? "tak" : "nie";
        return "Adres sklepu: " + adres + ", powierzchnia lokalu: " + powierzchnia + " m^2, WC: " + wc +
                ", czynsz najmu: " + czynszNajmu + " zł/mies.";
    }

    public int liczIloscPolek() {
        return (int) (powierzchnia / 2);
    }

    public final double obliczCzynsz(int liczbaMiesiecy) {
        return czynszNajmu * liczbaMiesiecy;
    }
}
