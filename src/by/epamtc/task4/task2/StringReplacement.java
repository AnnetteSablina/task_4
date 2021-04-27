package by.epamtc.task4.task2;


import by.epamtc.task4.utility.exception.InvalidPosValue;

public class StringReplacement {
    public static char[] splitSymbol = {' ','!',',','?',';',':','.'};
    public static String replacement (Replace replace, String s, char replaceSymbol) throws InvalidPosValue {
        return replace.replace(s,replaceSymbol);
    }
}
