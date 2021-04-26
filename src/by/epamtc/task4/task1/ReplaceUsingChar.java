package by.epamtc.task4.task1;

import by.epamtc.task4.utility.StringUtility;

import java.util.ArrayList;
import java.util.List;

public class ReplaceUsingChar implements Replace {

    @Override
    public String replace(String s, int pos, char replaceWord) {
        //if (s==null) //throw exception
        if (s.isEmpty() ) return s;
        //if (pos <0) throw invalidPosException
        List<String> replacedString = new ArrayList<>();
        //StringBuilder stringBuilder = new StringBuilder();

        for (String word : StringUtility.split(s, StringReplacement.splitSymbol)) {
            //stringBuilder.append(word + " ");
            //System.out.println(word.length());
            if (word != null) {
                if (word.length() >= pos) {
                    String replacedEnd;
                    if (pos == word.length()) replacedEnd = String.valueOf(replaceWord);
                    else replacedEnd= (replaceWord + StringUtility.substring(word.toCharArray(),pos,word.length()));
                    String string = ( StringUtility.append(StringUtility.substring(word.toCharArray(), 0,
                            pos - 1),replacedEnd));
                    replacedString.add(string);

                } else {
                    replacedString.add(word);
                }
            }

        }

        return replacedString.toString();


        //return null;
    }

}
