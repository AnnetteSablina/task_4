package by.epamtc.task4.task3.runner;


import by.epamtc.task4.task3.logic.ReplaceUsingRegex;
import by.epamtc.task4.task3.logic.StringReplacement;
import by.epamtc.task4.utility.exception.InvalidLenException;
import by.epamtc.task4.utility.exception.InvalidPosValue;
import by.epamtc.task4.utility.exception.NullException;

public class Runner {
    public static void main(String... args) throws NullException, InvalidLenException {
        System.out.println(StringReplacement.replacement(new ReplaceUsingRegex(), "Annette   loves Nikita!Meowwh", 6, "Love"));
    }
}
