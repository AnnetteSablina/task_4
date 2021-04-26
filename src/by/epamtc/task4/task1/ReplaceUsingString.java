package by.epamtc.task4.task1;

import by.epamtc.task4.utility.StringUtility;
import by.epamtc.task4.utility.exception.InvalidPosValue;

public class ReplaceUsingString implements Replace {

    @Override
    public String replace(String s, int pos, char replaceSymbol) throws InvalidPosValue {

        if (pos < 0) throw new InvalidPosValue("Position is invalid");
        StringBuilder sb = new StringBuilder();
        if (s != null && s.length() > 0 && pos > 0) {
            for (String word : StringUtility.split(s, StringReplacement.splitSymbol)) { // так как в методе сплит импользуется регекс, то я
                //написала собственный
                if (word != null) {
                   if (word.length() >= pos) {
                        sb.append(word, 0, pos - 1).append((replaceSymbol)).append(word.substring(pos));
                    } else {
                        sb.append(word);
                    }
                    sb.append(" ");
                }
            }
        }
        return sb.toString();
    }
}

