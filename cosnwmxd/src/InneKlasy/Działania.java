package InneKlasy;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Działania {

    public Date data;
    public Date drugadata;
    public long rozDat(Date data, Date drugadata)
    {
        long diffInMillies = Math.abs(data.getTime() - drugadata.getTime());

        return TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
    }
/*
NIE DZIAŁA PODAWANIE W MIESIĄCACH I DODAWANIE INTERWAŁU

    public long rozDatMies(Date data, Date drugadata)
    {
        long diffInMillies = Math.abs(data.getTime() - drugadata.getTime());

        return TimeUnit.MONTHS.convert(diffInMillies, TimeUnit.MILLISECONDS);
    }

    public Date interWal(Date data, Date drugadata, int xd2)
    {
        long diffInMillies = Math.abs(data.getTime() - drugadata.getTime());
        long dni = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        dni += xd2;

        return
    }
*/


}
