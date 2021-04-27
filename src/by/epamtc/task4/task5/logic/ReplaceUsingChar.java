package by.epamtc.task4.task5.logic;

import by.epamtc.task4.task3.logic.StringReplacement;
import by.epamtc.task4.utility.StringUtility;
import by.epamtc.task4.utility.exception.InvalidLenException;
import by.epamtc.task4.utility.exception.NullException;

public class ReplaceUsingChar implements Replace {
    @Override
    public String replace(String s, int wordLen) throws InvalidLenException, NullException {
        if (s == null) throw new NullException("String is null");
        if (wordLen < 0) throw new InvalidLenException("Length is invalid");
        StringBuilder res = new StringBuilder();
        for (String word : StringUtility.split(s, StringReplacement.splitSymbol)) {
            if (word != null) {
                if (!isNeedDelete(word,wordLen))
                    res.append(word).append(" ");
            }

        }
        return res.toString();
    }
    private static boolean isNeedDelete (String word,int wordLen){
        return (Symbol.isConsonant(word.charAt(0)) && word.length() == wordLen);
    }
}
