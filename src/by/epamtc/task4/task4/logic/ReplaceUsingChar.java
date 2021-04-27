package by.epamtc.task4.task4.logic;

import by.epamtc.task4.task3.logic.StringReplacement;
import by.epamtc.task4.task4.logic.Replace;
import by.epamtc.task4.utility.StringUtility;
import by.epamtc.task4.utility.exception.NullException;

public class ReplaceUsingChar implements Replace {
    @Override
    public String replace(String s) throws NullException {
        if (s == null) throw new NullException("String is null");
        if (s.isEmpty()) return s;
        StringBuilder res = new StringBuilder();
        for (String word : StringUtility.split(s, StringReplacement.splitSymbol)) {
                res.append(word).append(" ");
        }
        return res.toString();
    }
}
