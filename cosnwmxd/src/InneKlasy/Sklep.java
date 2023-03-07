package InneKlasy;

public class Sklep {
    public String adresSklepu;
    public int powierzchnia;
    public boolean czyJestWc;
    public int czynsz;

    public Sklep(String adresSklepu, int powierzchnia, boolean czyJestWc, int czynsz)
    {
        this.adresSklepu = adresSklepu;
        this.powierzchnia = powierzchnia;
        this.czyJestWc = czyJestWc;
        this.czynsz = czynsz;

    }

    @Override
    public String toString()
    {
        if(czyJestWc == true)
        {
            return "sklep znajduje się na ulicy " + adresSklepu + " ma " + powierzchnia + " m^2 i znajduje sie tam wc" + " czynsz wynosi: " + czynsz;
        }
        else {
            return "sklep znajduje się na ulicy " + adresSklepu + " ma " + powierzchnia + " m^2 i znajduje sie tam wc" + " czynsz wynosi: " + czynsz;

        }
    }

    public String lPolek()
    {

        return "można rozstawić w lokalu " + Math.round((powierzchnia / 2)) + " półek";
    }

    public String Final(int xd)
    {
        return "Czynsz za " + xd + " miesięcy wynosi: " + (czynsz * xd);
    }







}
