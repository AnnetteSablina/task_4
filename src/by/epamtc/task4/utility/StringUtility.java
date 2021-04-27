package by.epamtc.task4.utility;

public class StringUtility {


    public static String[] split(String s, char[] split) {
        int first = 0;
        int j = 0;
        String[] splitString = new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int k =i;
            if (i == s.length() - 1) {
                splitString[j] = StringUtility.substring(s.toCharArray(), first, i+1);
            }
            for (char sp : split) {
                if (s.charAt(i) == sp && s.charAt(++k) != sp) {
                    splitString[j] = StringUtility.substring(s.toCharArray(), first, i);
                    j++;
                    first = i + 1;
                }
            }

        }

        return splitString;
    }

    public static String append(String s, String appendString) {
        char[] info = s.toCharArray();
        char[] data = appendString.toCharArray();
        char[] result = new char[info.length + data.length];
        System.arraycopy(info, 0, result, 0, info.length);
        System.arraycopy(data, 0, result, info.length, data.length);
        return String.valueOf(result);
    }

    public static String substring(char[] subString, int beginIndex, int lastIndex) {
        if (beginIndex < 0) {
            throw new StringIndexOutOfBoundsException(beginIndex);
        }
        int subLen = lastIndex - beginIndex;
        if (subLen < 0) {
            throw new StringIndexOutOfBoundsException(subLen);
        }
        return (subLen == 0) ? String.valueOf(subString) : new String(subString, beginIndex, subLen);
    }

    private static char[] subLenCharArray(char[] subString, int beginIndex, int lastIndex) {
        char[] subArray = new char[lastIndex - beginIndex];
        for (int k = 0; k < subArray.length; k++) {
            subArray[k] = subString[beginIndex];
            beginIndex++;
        }
        return subArray;
    }

}
