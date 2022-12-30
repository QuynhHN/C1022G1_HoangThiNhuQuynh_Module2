package utils;

public class Regex {
    public static final String REGEX_VILLA_NAME = "^SVVL-\\d{4}$";
    public static final String REGEX_ROOM_NAME = "^SVRO[-]\\d{4}$";
    public static final String REGEX_NAME = "^[A-Z][a-z]+$";
    public static final String REGEX_AREA = "^([3-9]\\d|[1-9]\\d{2,})[.]\\d+$";
    public static final String REGEX_RENTAL_COSTS = "^\\d+(.\\d{1,2})?$";
    public static final String REGEX_MAX_PEOPLE = "^(1?[1-9]|10)$";
    public static final String REGEX_NUMBER_OF_FLOORS = "[1-9][\\d]*";
    public static final String REGEX_RENTAL_TYPE = "^[A-Z][a-z]+$";
    public static final String REGEX_ROOM_STANDARD="^[A-Z][a-z]+$";

}
