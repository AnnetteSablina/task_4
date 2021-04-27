package by.epamtc.task4.task1.logic;

import by.epamtc.task4.utility.StringUtility;
import by.epamtc.task4.utility.exception.InvalidPosValue;
import by.epamtc.task4.utility.exception.NullException;

import java.util.ArrayList;
import java.util.List;

public class ReplaceUsingChar implements Replace {

    @Override
    public String replace(String s, int pos, char replaceWord) throws NullException, InvalidPosValue {
        if (s == null) throw new NullException("String is null");
        if (pos < 0) throw new InvalidPosValue("Position is invalid");
        if (s.isEmpty())return s;
        List<String> replacedString = new ArrayList<>();
        for (String word : StringUtility.split(s, StringReplacement.splitSymbol)) {
            if (word != null) {
                if (word.length() >= pos) {
                    String replacedEnd;
                    if (pos == word.length()) replacedEnd = String.valueOf(replaceWord);
                    else replacedEnd = (replaceWord + StringUtility.substring(word.toCharArray(), pos, word.length()));
                    String string = (StringUtility.append(StringUtility.substring(word.toCharArray(), 0,
                            pos - 1), replacedEnd));
                    replacedString.add(string);

                } else {
                    replacedString.add(word);
                }
            }

        }

        return replacedString.toString();
    }

}
