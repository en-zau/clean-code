package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    private static final String DEFAULT_PATTERN = "dd/MM/yyyy HH:mm:ss";

    public static String format(String pattern, Date date) {
        SimpleDateFormat formateur = new SimpleDateFormat(getPattern(pattern));
        return formateur.format(date);
    }

    public static String formatDefaut(Date date) {
        SimpleDateFormat formateur = new SimpleDateFormat(DEFAULT_PATTERN);
        return formateur.format(date);
    }

    private static String getPattern(String pattern) {
        return pattern != null ? pattern : DEFAULT_PATTERN;
    }
}
