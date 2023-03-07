package InneKlasy;

public class Kwiaciarnia extends Sklep {
    private double powierzchniaZaplecza;

    public Kwiaciarnia(String adres, double powierzchnia, boolean czyJestWc, double czynszNajmu, double powierzchniaZaplecza) {
        super(adres, powierzchnia, czyJestWc, czynszNajmu);
        this.powierzchniaZaplecza = powierzchniaZaplecza;
    }

    @Override
    public String toString() {
        String wc = czyJestWc ? "tak" : "nie";
        return "Adres kwiaciarni: " + adres + ", powierzchnia lokalu: " + powierzchnia + " m^2, WC: " + wc +
                ", czynsz najmu: " + czynszNajmu + " zł/mies., powierzchnia zaplecza: " + powierzchniaZaplecza + " m^2";
    }

    @Override
    public int liczIloscPolek() {
        double calkowitaPowierzchnia = powierzchnia + powierzchniaZaplecza;
        return (int) (calkowitaPowierzchnia / 4);
    }
}
