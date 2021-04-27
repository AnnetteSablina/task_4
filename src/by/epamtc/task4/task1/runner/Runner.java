package by.epamtc.task4.task1.runner;

import by.epamtc.task4.task1.logic.ReplaceUsingRegex;
import by.epamtc.task4.task1.logic.StringReplacement;
import by.epamtc.task4.utility.exception.InvalidPosValue;
import by.epamtc.task4.utility.exception.NullException;

public class Runner {
    public static void main (String...args) throws InvalidPosValue, NullException {
        System.out.println(StringReplacement.replacement(new ReplaceUsingRegex(),"Annettes   loves Nikita!Meowwwh",6, 'W'));
    }
}
