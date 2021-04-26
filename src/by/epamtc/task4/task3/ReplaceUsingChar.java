package by.epamtc.task4.task3;

import by.epamtc.task4.utility.StringUtility;
import by.epamtc.task4.utility.exception.InvalidPosValue;

import java.util.ArrayList;
import java.util.List;

public class ReplaceUsingChar implements Replace {
    @Override
    public String replace(String s, int wordLen, String replaceString) throws InvalidPosValue {
        //if (s==null) //throw exception
        if (s.isEmpty()) return s;
        if (wordLen < 0) throw new InvalidPosValue("Word length is under 0");
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
