package by.epamtc.task4.task2;

import by.epamtc.task4.utility.StringUtility;
import by.epamtc.task4.utility.exception.InvalidPosValue;

public class ReplaceUsingString implements Replace {

    @Override
    public String replace(String s, char replaceSymbol) throws InvalidPosValue {
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : StringUtility.split(s, StringReplacement.splitSymbol)) {
            if (word != null) {
                if (!(isWasReplaced(stringBuilder, word, replaceSymbol)))
                    stringBuilder.append(word).append(" ");
            }
        }
        return stringBuilder.toString();
    }

    private boolean isWasReplaced(StringBuilder sb, String word, char replaceSymbol) {
        boolean isWasReplaced = false;
        StringBuilder changedWord = new StringBuilder().append(word);
        int index = 0;
        for (char symbol : word.toCharArray()) {
            if (symbol == replaceSymbol && (word.charAt(word.length() - 1) != replaceSymbol)) {
                rep(changedWord, index);
                isWasReplaced = true;
            }
            index++;
        }
        if (isWasReplaced) sb.append(changedWord).append(" ");
        return isWasReplaced;
    }

    private void rep(StringBuilder word, int i) {
        if (word.charAt(i + 1) == 'a') {
            replaceCharAt(word, i + 1, 'о');
        }
    }

    private void replaceCharAt(StringBuilder sb, int pos, char c) {
        sb.deleteCharAt(pos).insert(pos, c);
    }
}
