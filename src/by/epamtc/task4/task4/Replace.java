package by.epamtc.task4.task4;

import by.epamtc.task4.utility.exception.InvalidPosValue;

public interface Replace {
    String replace(String s, int wordLen, String replaceString) throws InvalidPosValue;
}
