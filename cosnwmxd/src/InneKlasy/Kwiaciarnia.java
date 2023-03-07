package InneKlasy;

public class Kwiaciarnia extends Sklep {
    int powierzchniaZaplecza;
    public Kwiaciarnia(String adresSklepu, int powierzchnia, boolean czyJestWc, int czynsz, int powierzchniaZaplecza)
    {
        super(adresSklepu, powierzchnia, czyJestWc, czynsz);
        this.powierzchniaZaplecza = powierzchniaZaplecza;
    }

    @Override
    public String toString()
    {
        if(czyJestWc == true)
        {
            return "sklep znajduje się na ulicy " + adresSklepu + " ma " + powierzchnia + " m^2 i znajduje sie tam wc" + " czynsz wynosi: " + czynsz + " Dodatkowo zaplecze ma " + powierzchniaZaplecza + " m^2";
        }
        else {
            return "sklep znajduje się na ulicy " + adresSklepu + " ma " + powierzchnia + " m^2 i znajduje sie tam wc" + " czynsz wynosi: " + czynsz + " Dodatkowo zaplecze ma " + powierzchniaZaplecza + " m^2";

        }
    }

    @Override
    public String lPolek()
    {

        return "można rozstawić w lokalu z zapleczeme " + Math.round((powierzchnia / 4)) + " półek";
    }


}
