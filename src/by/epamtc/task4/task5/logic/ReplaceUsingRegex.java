package by.epamtc.task4.task5.logic;

import by.epamtc.task4.task5.logic.Replace;
import by.epamtc.task4.utility.exception.InvalidLenException;
import by.epamtc.task4.utility.exception.NullException;

public class ReplaceUsingRegex implements Replace {
    @Override
    public String replace(String s, int wordLen) throws NullException, InvalidLenException {
        if (s == null) throw new NullException("String is null");
        if (wordLen < 0) throw new InvalidLenException("Length is invalid");
        String patternString = "(\\b[^aeiouAEIOU][a-zA-Z]{" + (wordLen - 1) + "}\\b)";
        return s.replaceAll(patternString,"");
    }
}
