package ru.nsu.hci.studenov.javalabs.lab5;

import java.util.Formatter;

public class Formater {
    public static void main(String[] args) {
        Formatter format = new Formatter();
        String yourName = "Venedikt", name = "Jarvis", description = "AI from some movie";
        format.format("Hello, %s. My name is %s,\nI am  %s - %s.", yourName, name, name, description);
        System.out.println(format);
    }
}
package ru.nsu.hci.studenov.javalabs.lab5;

public class Formatter {
    public String Format(String str, String ... words){
        int index1 = 0;
        int nowPosition =0;
        for (int position = 0; position < str.length();position++) {
            int index = str.indexOf('$');
            position = index;
            while(str.charAt(position) !='}'){
                position++;
                if (str.charAt(position) =='{') {
                    index1 = position+1;
                }
            }
            int number = Integer.parseInt(str,index1,position,10);
            System.out.println(number);
            str = Builder(str, index,nowPosition, words[number]);
            System.out.println(str);
            nowPosition = position;

        }
        return str;
    }

    public String Builder(String str ,  int index, int position, String word ){
        StringBuffer strBuffer = new StringBuffer(str);
        strBuffer.append(str.substring(position ,index -1));
        strBuffer.append(word);

        return str.toString() ;
    }
}
