package by.epamtc.task4.task3;


import by.epamtc.task4.utility.exception.InvalidPosValue;

public class Runner {
    public static void main(String... args) throws InvalidPosValue {
        System.out.println(StringReplacement.replacement(new ReplaceUsingRegex(), "Annette   loves Nikita!Meowwh", 6, "Love"));
    }
}
