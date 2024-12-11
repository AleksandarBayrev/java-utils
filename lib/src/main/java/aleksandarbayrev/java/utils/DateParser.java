package aleksandarbayrev.java.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import aleksandarbayrev.java.utils.interfaces.IDateParser;

public class DateParser implements IDateParser {
    private final SimpleDateFormat _dateFormatter = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public Date getDate(String date) throws ParseException {
        return _dateFormatter.parse(date);
    }
}
