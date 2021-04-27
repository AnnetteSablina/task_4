package by.epamtc.task4.task4.logic;

import by.epamtc.task4.task4.logic.Replace;
import by.epamtc.task4.utility.exception.InvalidPosValue;
import by.epamtc.task4.utility.exception.NullException;

public class ReplaceUsingRegex implements Replace {


    @Override
    public String replace(String s) throws InvalidPosValue, NullException {
        if (s == null ) throw new NullException("String is null");
        if (s.isEmpty()) return s;
        return s.replaceAll("[^a-zA-Z\n]", " ").trim();
    }
}
