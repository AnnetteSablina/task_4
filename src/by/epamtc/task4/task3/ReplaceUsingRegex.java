package by.epamtc.task4.task3;


import java.util.regex.Pattern;

public class ReplaceUsingRegex implements Replace {

    @Override
    public String replace(String s, int wordLen, String replaceString) {
        return s.replaceAll("\\b[a-zA-Z]{" + wordLen + "}\\b",replaceString);
    }
}

