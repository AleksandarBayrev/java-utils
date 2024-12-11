package aleksandarbayrev.java.utils.interfaces;

import java.text.ParseException;
import java.util.Date;

public interface IDateParser {
    Date getDate(String format, String date) throws ParseException;
}
