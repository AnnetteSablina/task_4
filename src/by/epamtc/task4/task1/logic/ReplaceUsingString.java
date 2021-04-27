package by.epamtc.task4.task1.logic;

import by.epamtc.task4.utility.StringUtility;
import by.epamtc.task4.utility.exception.InvalidPosValue;
import by.epamtc.task4.utility.exception.NullException;

public class ReplaceUsingString implements Replace {

    @Override
    public String replace(String s, int pos, char replaceSymbol) throws InvalidPosValue, NullException {
        if (s == null) throw new NullException("String is null");
        if (pos < 0) throw new InvalidPosValue("Position is invalid");
        if (s.isEmpty()) return s;
        StringBuilder sb = new StringBuilder();
        for (String word : StringUtility.split(s, StringReplacement.splitSymbol)) { // так как в методе сплит импользуется регекс, то я
            //написала собственный
            if (word.length() >= pos) {
                sb.append(word, 0, pos - 1).append((replaceSymbol)).append(word.substring(pos));
            } else {
                sb.append(word);
            }
            sb.append(" ");

        }
        return sb.toString();
    }
}

