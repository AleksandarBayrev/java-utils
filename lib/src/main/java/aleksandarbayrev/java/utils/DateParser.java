package aleksandarbayrev.java.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import aleksandarbayrev.java.utils.interfaces.IDateParser;

public class DateParser implements IDateParser {
    private final Map<String, SimpleDateFormat> _formatters = new HashMap<>();

    @Override
    public Date getDate(String format, String date) throws ParseException {
        if (!_formatters.containsKey(format)) {
            _formatters.put(format, new SimpleDateFormat(format));
        }
        return _formatters.get(format).parse(date);
    }
}
