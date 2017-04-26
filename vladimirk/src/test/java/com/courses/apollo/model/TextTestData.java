package com.courses.apollo.model;

import java.util.ArrayList;
import java.util.List;

public class TextTestData {

    public static List<String> getExpectedStringsA() {
        return new ArrayList<String>() {{
            add(new String("In the sentence 1 more vowels"));
            add(new String("The same number of vowels and consonants in sentense 2"));
            add(new String("In the sentence 3 more consonants"));
        }};
    }

    public String getTextA() {
        return "A favorite author! Conan Doyle. Motley Ribbon...";
    }

    public String getTextB() {
        return "A book of verses underneath the bough\n" +
                "A flask of wine, a loaf of bread and thou\n" +
                "Beside me singing in the wilderness\n" +
                "And wilderness is paradise now.";
    }

    public String getTextC() {
        return "olto, ff, beta, omo, Sees, otjmo, Aomo, nulan, Alpha";
    }

    public static List<String> getExpectedStringsC() {
        return new ArrayList<String>(){{
            add(new String("olto"));
            add(new String("ff"));
            add(new String("omo"));
            add(new String("Sees"));
            add(new String("otjmo"));
            add(new String("nulan"));
            add(new String("Alpha"));
        }};
    }

    public String getTextD() {
        return "Why did the Sahara die? The answer lies in the history of monsoon rains that bring wetness " +
                "from western and central Africa into the Sahara.";
    }

    public List<String> getExpectedStringsD() {
        return new ArrayList<String>() {{
            add(new String("in"));
            add(new String("history"));
            add(new String("of"));
            add(new String("monsoon"));
            add(new String("wetness"));
            add(new String("western"));
            add(new String("central"));
        }};
    }

    public String getTextE() {
        return "Billy, you stinky bastard, get me back my money urgently!";
    }
}