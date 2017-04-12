package com.courses.apollo.model;

import java.util.ArrayList;
import java.util.List;

public class TextTestData {

    public static List<String> getExpectedStringsA() {
        List<String> expected = new ArrayList<>();
        expected.add(new String("In the sentence 1 more vowels"));
        expected.add(new String("The same number of vowels and consonants in sentense 2"));
        expected.add(new String("In the sentence 3 more consonants"));
        return expected;
    }

    public String getTextA() {
        String text = "A favorite author! Conan Doyle. Motley Ribbon...";
        return text;
    }

    public String getTextB() {
        String text =
                "A book of verses underneath the bough\n" +
                "A flask of wine, a loaf of bread and thou\n" +
                "Beside me singing in the wilderness\n" +
                "And wilderness is paradise now.";
        return text;
    }

    public String getTextC() {
        String text = "olto, ff, beta, omo, Sees, otjmo, Aomo, nulan, Alpha";
        return text;
    }

    public static List<String> getExpectedStringsC() {
        List<String> expected = new ArrayList<>();
        expected.add(new String("olto"));
        expected.add(new String("ff"));
        expected.add(new String("omo"));
        expected.add(new String("Sees"));
        expected.add(new String("otjmo"));
        expected.add(new String("nulan"));
        expected.add(new String("Alpha"));
        return expected;
    }

    public String getTextD() {
        String text = "Why did the Sahara die? " +
                "The answer lies in the history of monsoon rains that bring wetness from " +
                "western and central Africa into the Sahara.";
        return text;
    }

    public List<String> getExpectedStringsD() {
        List<String> expected = new ArrayList<>();
        expected.add(new String("in"));
        expected.add(new String("history"));
        expected.add(new String("of"));
        expected.add(new String("monsoon"));
        expected.add(new String("wetness"));
        expected.add(new String("western"));
        expected.add(new String("central"));
        return expected;
    }

    public String getTextE() {
        String text = "Billy, you stinky bastard, get me back my money urgently!";
        return text;
    }
}