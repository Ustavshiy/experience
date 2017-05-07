package com.courses.apollo.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by on 07.05.2017.
 */
public class TextService {

    public int findSumNumber(String text){
        Pattern p = Pattern.compile("\\d");
        Matcher m = p.matcher(text);
        int count = 0;
            while (m.find()) {
                int number = new Integer(m.group());
                count = count + number;
            }
        return count;
    }

    public String noComments(String text){
        String replacement = "";
        String newText = Pattern.compile("/\\*|/").matcher(text).replaceAll(replacement);
        return newText;
    }
}
