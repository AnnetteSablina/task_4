package by.epamtc.task4.task3;


import java.util.regex.Pattern;

public class ReplaceUsingRegex implements Replace {

    @Override
    public String replace(String s, int wordLen, String replaceString) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : s.split("\\s* |([:;,!.?])")) {
            if (word.length() == wordLen) {
                stringBuilder.append(word.replaceAll("\\b(\\w+?)\\b",
                        String.valueOf(replaceString))).append(" ");
            } else stringBuilder.append(word).append(" ");
        }
        //var res = Pattern.compile(String.format("([\\s:;,!.?])(\\w{%d})([\\s:;,!.?])",wordLen), Pattern.CASE_INSENSITIVE).matcher(s).replaceAll(replaceString);

        return stringBuilder.toString();
    }
}

