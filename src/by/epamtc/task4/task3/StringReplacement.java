package by.epamtc.task4.task3;

import by.epamtc.task4.utility.exception.InvalidPosValue;

public class StringReplacement {
    public static char[] splitSymbol = {' ', '!', ',', '?', ';', ':'};

    public static String replacement(Replace replace, String s, int wordLen, String replaceString) throws InvalidPosValue {
        return replace.replace(s, wordLen, replaceString);
    }
}

