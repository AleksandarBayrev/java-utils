package aleksandarbayrevjavautils.interfaces;

import java.text.ParseException;
import java.util.Date;

public interface IDateParser {
    /**
     * Returns java.util.Date based on the format you provided
     * @param format - the desired date format (example: yyyy-MM-dd)
     * @param date - the desired date from string
     * @returns java.util.Date
     */
    Date getDate(String format, String date) throws ParseException;
}
