package by.epamtc.task4.task5.runner;


import by.epamtc.task4.task5.logic.ReplaceUsingString;
import by.epamtc.task4.task5.logic.StringReplacement;
import by.epamtc.task4.utility.exception.InvalidLenException;
import by.epamtc.task4.utility.exception.InvalidPosValue;
import by.epamtc.task4.utility.exception.NullException;

public class Runner {
    public static void main(String... args) throws InvalidPosValue, NullException, InvalidLenException {
        System.out.println(StringReplacement.replacement(new ReplaceUsingString(), "Annette   loves Nikita!Meowwh",6));
    }
}
