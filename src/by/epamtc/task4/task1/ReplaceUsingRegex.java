package by.epamtc.task4.task1;

public class ReplaceUsingRegex implements Replace {

    @Override
    public String replace(String s, int pos,char replaceWord) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : s.split("\\s* |([:;,!.?])")) {
            if (word.length() >= pos) {
                String end = word.substring(pos);
                stringBuilder.append(word.replaceAll(word.substring(pos - 1),
                        String.valueOf(replaceWord))).append(end).append(" ");
            } else stringBuilder.append(word).append(" ");
        }
        return stringBuilder.toString();
    }
}
