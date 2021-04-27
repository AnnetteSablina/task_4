package by.epamtc.task4.task1;

import by.epamtc.task4.utility.exception.InvalidPosValue;

public class StringReplacement {
    public static char[] splitSymbol = {' ','!',',','?',';',':','.'};
    public static String replacement (Replace replace, String s, int pos, char replaceSymbol) throws InvalidPosValue {
        return replace.replace(s,pos,replaceSymbol);
    }
}
