package ru.nsu.hci.studenov.javalabs.lab5;


public class Formatter {
    private StringBuffer sb = new StringBuffer();
    private int begin = 0;
    private int endForBegin = 0;

    private Formatter() {}

    private String format(String str, boolean flag, Object[] words) {
        int end = 0;
        String word = "";

        int curr = str.indexOf('$');

        while (true) {
            curr = str.indexOf('$', curr);
            if (curr == -1)
                break;
            curr++;
            if (str.charAt(curr) != '{')
                continue;
            word = words[parseNumber(str, curr)].toString();
            appendFragment(str, curr, word);
            begin = endForBegin + 1;
        }

        if (begin < str.length())
            sb.append(str.substring(begin, str.length()));
        

        return sb.toString();
    }

    private void appendFragment(String str, int end, String word) {
        sb.append(str.substring(begin, end - 1));
        sb.append(word);
    }

    private int parseNumber(String str, int begin) {
        int end = str.indexOf('}', begin);

        this.endForBegin = end;
        return Integer.parseInt(str, begin + 1, end, 10);
    }

    public static String format(String formatString, Object... arguments) {
        return new Formatter().format(formatString, true, arguments);
    }
}
