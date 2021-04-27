package by.epamtc.task4.task3.logic;

import by.epamtc.task4.utility.StringUtility;
import by.epamtc.task4.utility.exception.InvalidLenException;
import by.epamtc.task4.utility.exception.NullException;

import java.util.ArrayList;
import java.util.List;

public class ReplaceUsingChar implements Replace {
    @Override
    public String replace(String s, int wordLen, String replaceString) throws NullException, InvalidLenException {
        if (s == null || replaceString == null) throw new NullException("String is null");
        if (wordLen < 0) throw new InvalidLenException("Length is invalid");
        if (s.isEmpty()) return s;
        List<String> replacedString = new ArrayList<>();

        for (String word : StringUtility.split(s, StringReplacement.splitSymbol)) {
            if (word != null) {
                if (word.length() == wordLen) {
                    replacedString.add(replaceString);

                } else {
                    replacedString.add(word);
                }
            }

        }

        return replacedString.toString();

    }
}
