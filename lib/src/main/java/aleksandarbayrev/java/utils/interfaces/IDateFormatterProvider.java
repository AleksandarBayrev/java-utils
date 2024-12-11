package aleksandarbayrev.java.utils.interfaces;

import java.text.SimpleDateFormat;

import aleksandarbayrev.java.utils.enums.DateFormats;

public interface IDateFormatterProvider {
    SimpleDateFormat AddDateFormatProvider(DateFormats dateFormat);
    SimpleDateFormat GetDateFormatProvider(DateFormats dateFormat);
}