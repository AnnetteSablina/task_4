package by.epamtc.task4.task1;

import by.epamtc.task4.utility.exception.InvalidPosValue;

public interface Replace {
    String replace(String s, int pos, char replaceSymbol) throws InvalidPosValue;
}
