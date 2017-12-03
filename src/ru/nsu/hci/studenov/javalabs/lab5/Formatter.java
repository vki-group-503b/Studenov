package ru.nsu.hci.studenov.javalabs.lab5;


public class Formatter {
    public StringBuffer sb = new StringBuffer();
    public int begin = 0;
    public int endForBegin = 0;

    public String Format(String str, String... words) {
        int end = 0;
        String word = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '$') {
                end = i;
                if (str.charAt(end + 1) == '{') {
                    word = words[NumberPars(str, end + 1)];
                    Builder(str, end, word);
                    begin = endForBegin + 1;
                }
            }
        }


        return Builder();
    }

    public void Builder(String str, int end, String word) {
        sb.append(str.substring(begin, end));
        sb.append(word);
    }

    public String Builder() {
        return sb.toString();
    }

    public Integer NumberPars(String str, int begin) {
        int end = begin;
        while (str.charAt(end) != '}')
            end++;
        this.endForBegin = end;
        return Integer.parseInt(str, begin + 1, end, 10);
    }
}
