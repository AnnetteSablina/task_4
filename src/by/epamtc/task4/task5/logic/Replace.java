package by.epamtc.task4.task5.logic;


import by.epamtc.task4.utility.exception.InvalidLenException;
import by.epamtc.task4.utility.exception.NullException;

public interface Replace {
    String replace(String s,int wordLen) throws InvalidLenException, NullException;
}
