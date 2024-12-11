package aleksandarbayrev.java.utils.enums;

public enum DateFormats {
    Standart("yyyy-MM-dd HH:mm:ss"), WithoutSeconds("yy-MM-dd HH:mm");

    private final String _dateFormat;

    DateFormats(String dateFormat) {
        _dateFormat = dateFormat;
    }

    public String getValue() {
        return _dateFormat;
    }
}
