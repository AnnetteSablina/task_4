package by.epamtc.task4.task2.logic;

import by.epamtc.task4.utility.exception.InvalidPosValue;
import by.epamtc.task4.utility.exception.NullException;

public interface Replace {
    String replace(String s, char ReplaceSymbol) throws InvalidPosValue, NullException;
}
