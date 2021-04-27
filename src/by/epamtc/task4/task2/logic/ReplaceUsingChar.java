package by.epamtc.task4.task2.logic;


import by.epamtc.task4.utility.StringUtility;
import by.epamtc.task4.utility.exception.InvalidPosValue;
import by.epamtc.task4.utility.exception.NullException;

import java.util.ArrayList;
import java.util.List;


public class ReplaceUsingChar implements Replace {
    @Override
    public String replace(String s, char replaceSymbol) throws InvalidPosValue, NullException {
        if (s == null) throw new NullException("String is null");
        if (s.isEmpty()) return s;
        List<String> replacedString = new ArrayList<>();
        for (String word : StringUtility.split(s, StringReplacement.splitSymbol)) {
                replacedString.add(replaceSymbol(word,replaceSymbol));
        }
        return replacedString.toString();
    }

    private String replaceSymbol(String word, char replaceSymbol) {
        int index = 0;
        for (char c : word.toCharArray()) {
            if (c == replaceSymbol && (word.charAt(word.length() - 1) != replaceSymbol)) {
                word = (replace(word, index));
            }
            index++;
        }
        return word;
    }

    private String replace(String s, int i) {
        if (s.charAt(i + 1) == 'a') {
            return replaceCharAt(s, i + 1, 'о');
        }
        return s;
    }

    private String replaceCharAt(String s, int pos, char c) {
        if (pos + 1 == s.length()) return StringUtility.substring(s.toCharArray(), 0, pos) + c;
        return StringUtility.substring(s.toCharArray(), 0, pos) + c +
                StringUtility.substring(s.toCharArray(), pos
                        + 1, s.length());
    }
}


