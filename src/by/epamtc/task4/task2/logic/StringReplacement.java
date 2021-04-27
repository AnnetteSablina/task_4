package by.epamtc.task4.task2.logic;


import by.epamtc.task4.task2.logic.Replace;
import by.epamtc.task4.utility.exception.InvalidPosValue;
import by.epamtc.task4.utility.exception.NullException;

public class StringReplacement {
    public static char[] splitSymbol = {' ', '!', ',', '?', ';', ':', '.', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
    public static String replacement (Replace replace, String s, char replaceSymbol) throws InvalidPosValue, NullException {
        return replace.replace(s,replaceSymbol);
    }
}
