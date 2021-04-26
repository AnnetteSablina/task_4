package by.epamtc.task4.task1;

import by.epamtc.task4.utility.StringUtility;
import by.epamtc.task4.utility.exception.InvalidPosValue;

public class Runner {
    public static void main (String...args) throws InvalidPosValue {
        System.out.println(StringReplacement.replacement(new ReplaceUsingRegex(),"Annettes   loves Nikita!Meowwwh",6, 'W'));
    }
}
