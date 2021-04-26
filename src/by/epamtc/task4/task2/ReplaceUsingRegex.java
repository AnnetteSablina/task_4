package by.epamtc.task4.task2;

import by.epamtc.task4.utility.exception.InvalidPosValue;

import java.util.regex.Pattern;

public class ReplaceUsingRegex implements Replace {

    @Override
    public String replace(String s, char replaceSymbol) throws InvalidPosValue {
        var pattern = String.format("(%ca)", replaceSymbol);
        var res = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE).matcher(s).
                replaceAll(String.format("%co",replaceSymbol));
        return res;
    }

}

