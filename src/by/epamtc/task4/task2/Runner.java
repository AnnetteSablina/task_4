package by.epamtc.task4.task2;


import by.epamtc.task4.utility.exception.InvalidPosValue;

public class Runner {
    public static void main(String... args) throws InvalidPosValue {
        var str = "Annettes   loves Nipapa!Meowwwh";
        System.out.println("Was: " + str);
        System.out.println(StringReplacement.replacement(new ReplaceUsingRegex(), str , 'p'));
    }
}
