package by.epamtc.task4.task3.logic;


import by.epamtc.task4.task3.logic.Replace;
import by.epamtc.task4.utility.exception.InvalidLenException;
import by.epamtc.task4.utility.exception.InvalidPosValue;
import by.epamtc.task4.utility.exception.NullException;


public class ReplaceUsingRegex implements Replace {

    @Override
    public String replace(String s, int wordLen, String replaceString) throws NullException, InvalidLenException {
        if (s == null || replaceString == null) throw new NullException("String is null");
        if (wordLen < 0) throw new InvalidLenException("Length is invalid");
        if (s.isEmpty()) return s;
        return s.replaceAll("\\b[a-zA-Z]{" + wordLen + "}\\b", replaceString);
    }
}

