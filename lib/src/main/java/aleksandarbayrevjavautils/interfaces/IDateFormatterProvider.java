package aleksandarbayrevjavautils.interfaces;

import java.text.SimpleDateFormat;

import aleksandarbayrevjavautils.enums.DateFormats;

public interface IDateFormatterProvider {
    /**
     * Adds and returns java.text.SimpleDateFormat 
     * @param dateFormat - the desired date format from the enum
     * @returns java.text.SimpleDateFormat
     */
    SimpleDateFormat AddDateFormatProvider(DateFormats dateFormat);

    /**
     * Returns java.text.SimpleDateFormat 
     * @param dateFormat - the desired date format from the enum
     * @returns java.text.SimpleDateFormat
     */
    SimpleDateFormat GetDateFormatProvider(DateFormats dateFormat);
}