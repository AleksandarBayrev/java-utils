package aleksandarbayrevjavautils;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import aleksandarbayrevjavautils.enums.DateFormats;
import aleksandarbayrevjavautils.interfaces.IDateFormatterProvider;

public class DateFormatterProvider implements IDateFormatterProvider {
    private final Map<String, SimpleDateFormat> _dateFormatters;

    public DateFormatterProvider() {
        _dateFormatters = new HashMap<>();
    }

    @Override
    public SimpleDateFormat AddDateFormatProvider(DateFormats dateFormat) {
        _dateFormatters.put(dateFormat.getValue(), new SimpleDateFormat(dateFormat.getValue()));
        return _dateFormatters.get(dateFormat.getValue());
    }

    @Override
    public SimpleDateFormat GetDateFormatProvider(DateFormats dateFormat) {
        return _dateFormatters.get(dateFormat.getValue());
    }
    
}
