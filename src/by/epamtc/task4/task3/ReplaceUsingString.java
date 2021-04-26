package by.epamtc.task4.task3;


import by.epamtc.task4.utility.StringUtility;
import by.epamtc.task4.utility.exception.InvalidPosValue;


public class ReplaceUsingString implements Replace {

    @Override
    public String replace(String s, int wordLen, String replaceString) throws InvalidPosValue {

        if (wordLen < 0) throw new InvalidPosValue("Position is invalid");
        StringBuilder sb = new StringBuilder();
        for (String word : StringUtility.split(s, StringReplacement.splitSymbol)) { // так как в методе сплит импользуется регекс, то я
            //написала собственный
            if (word != null) {
                if (word.length() == wordLen) {
                    sb.append(replaceString);
                } else {
                    sb.append(word);
                }
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}


