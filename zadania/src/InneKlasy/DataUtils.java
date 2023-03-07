package InneKlasy;


import java.time.LocalDate;
import java.time.Period;

public class DataUtils {
    public static int roznicaDatMiesiace(LocalDate data1, LocalDate data2) {
        Period period = Period.between(data1.withDayOfMonth(1), data2.withDayOfMonth(1));
        return period.getYears() * 12 + period.getMonths();
    }

    public static int roznicaDatDni(LocalDate data1, LocalDate data2) {
        return (int) (data2.toEpochDay() - data1.toEpochDay());
    }

    public static LocalDate dataPoInterwaleDni(LocalDate data, int interwal) {
        return data.plusDays(interwal);
    }
}

