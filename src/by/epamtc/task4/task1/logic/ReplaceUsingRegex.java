package by.epamtc.task4.task1.logic;

import by.epamtc.task4.task1.logic.Replace;
import by.epamtc.task4.utility.exception.InvalidPosValue;
import by.epamtc.task4.utility.exception.NullException;

public class ReplaceUsingRegex implements Replace {

    @Override
    public String replace(String s, int pos, char replaceWord) throws InvalidPosValue, NullException {
        if (s == null) throw new NullException("String is null");
        if (pos < 0) throw new InvalidPosValue(" Invalid position");
        if (s.isEmpty()) return s;
        String pattern = ("([a-zA-Z]{" + (pos - 1) + ("})([a-zA-Z])(a-zA-Z)*"));
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : s.split("\\s* |([:;,!.?])")) {
            if (word.length() >= pos) {
                stringBuilder.append(word.replaceAll(pattern, "$1" + replaceWord + "$3")).append(" ");
            } else stringBuilder.append(word).append(" ");
        }
        return stringBuilder.toString();
    }
}
