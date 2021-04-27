package by.epamtc.task4.task4.runner;


import by.epamtc.task4.task4.logic.ReplaceUsingChar;
import by.epamtc.task4.task4.logic.StringReplacement;
import by.epamtc.task4.utility.exception.InvalidPosValue;
import by.epamtc.task4.utility.exception.NullException;

public class Runner {
    public static void main(String... args) throws InvalidPosValue, NullException {
        System.out.println(StringReplacement.replacement(new ReplaceUsingChar(), "Annette   loves Nikita!Meowwh"));
    }
}
