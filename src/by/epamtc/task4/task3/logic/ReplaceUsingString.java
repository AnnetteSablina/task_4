package by.epamtc.task4.task3.logic;


import by.epamtc.task4.utility.StringUtility;
import by.epamtc.task4.utility.exception.InvalidLenException;
import by.epamtc.task4.utility.exception.NullException;


public class ReplaceUsingString implements Replace {

    @Override
    public String replace(String s, int wordLen, String replaceString) throws NullException, InvalidLenException {
        if (s == null || replaceString == null) throw new NullException("String is null");
        if (wordLen < 0) throw new InvalidLenException("Length is invalid");
        if (s.isEmpty()) return s;
        StringBuilder sb = new StringBuilder();
        for (String word : StringUtility.split(s, StringReplacement.splitSymbol)) { // так как в методе сплит импользуется регекс, то я
            //написала собственный
            if (word.length() == wordLen) {
                sb.append(replaceString);
            } else {
                sb.append(word);
            }
            sb.append(" ");

        }
        return sb.toString();
    }
}


