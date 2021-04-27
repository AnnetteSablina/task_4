package by.epamtc.task4.task1.logic;

import by.epamtc.task4.utility.exception.InvalidPosValue;
import by.epamtc.task4.utility.exception.NullException;

public interface Replace {
    String replace(String s, int pos, char replaceSymbol) throws InvalidPosValue, NullException;
}
