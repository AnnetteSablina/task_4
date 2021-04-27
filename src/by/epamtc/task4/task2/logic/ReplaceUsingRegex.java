package by.epamtc.task4.task2.logic;

import by.epamtc.task4.task2.logic.Replace;
import by.epamtc.task4.utility.exception.InvalidPosValue;
import by.epamtc.task4.utility.exception.NullException;

import java.util.regex.Pattern;

public class ReplaceUsingRegex implements Replace {

    @Override
    public String replace(String s, char replaceSymbol) throws InvalidPosValue, NullException {
        if (s == null) throw new NullException("String is null");
        if (s.isEmpty()) return s;
        String pattern = String.format("(%ca)", replaceSymbol);
        return Pattern.compile(pattern, Pattern.CASE_INSENSITIVE).matcher(s).
                replaceAll(String.format("%co",replaceSymbol));
    }

}

