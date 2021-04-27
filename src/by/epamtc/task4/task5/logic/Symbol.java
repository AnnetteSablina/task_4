package by.epamtc.task4.task5.logic;

public class Symbol {
    public static final String CONSONANT_SYMBOL = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";

    public static boolean isConsonant(char c) {
        for (char symbol :CONSONANT_SYMBOL.toCharArray()) {
            if (c == symbol) return true;
        }
        return false;
    }
}
