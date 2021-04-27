package by.epamtc.task4.task3.logic;

import by.epamtc.task4.utility.exception.InvalidLenException;
import by.epamtc.task4.utility.exception.InvalidPosValue;
import by.epamtc.task4.utility.exception.NullException;

public interface Replace {

    String replace(String s, int wordLen, String replaceString) throws  NullException, InvalidLenException;


}
