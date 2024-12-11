package aleksandarbayrevjavautils.interfaces;

import java.text.SimpleDateFormat;

import aleksandarbayrevjavautils.enums.DateFormats;

public interface IDateFormatterProvider {
    SimpleDateFormat AddDateFormatProvider(DateFormats dateFormat);
    SimpleDateFormat GetDateFormatProvider(DateFormats dateFormat);
}