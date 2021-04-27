package by.epamtc.task4.task4.logic;

import by.epamtc.task4.utility.exception.InvalidPosValue;
import by.epamtc.task4.utility.exception.NullException;

public interface Replace {
    String replace(String s) throws InvalidPosValue, NullException;
}
