package com.courses.apollo.model;

import java.util.ArrayList;
import java.util.List;

public class TextTestData {

    public static List<String> getExpectedStrings1() {
        List<String> expected = new ArrayList<>();
        String string = new String("In the sentence 1 more vowels");
        String string1 = new String("The same number of vowels and consonants in sentense 2");
        String string2 = new String("In the sentence 3 more consonants");
        expected.add(string);
        expected.add(string1);
        expected.add(string2);
        return expected;
    }

    public String getText1() {
        String text = "A favorite author! Conan Doyle. Motley Ribbon...";
        return text;
    }

    public String getText2() {
        String text =
                "A book of verses underneath the bough\n" +
                "A flask of wine, a loaf of bread and thou\n" +
                "Beside me singing in the wilderness\n" +
                "And wilderness is paradise now.";
        return text;
    }

    public String getText5() {
        String text = "Billy, you stinky bastard, get me back my money urgently!";
        return text;
    }

    public String getText3() {
        String text = "olto, ff, beta, omo, Sees, otjmo, Aomo, nulan, Alpha";
        return text;
    }

    public static List<String> getExpectedStrings3() {
        List<String> expected = new ArrayList<>();
        String string = new String("olto");
        String string1 = new String("ff");
        String string2 = new String("omo");
        String string3 = new String("Sees");
        String string4 = new String("otjmo");
        String string5 = new String("nulan");
        String string6 = new String("Alpha");
        expected.add(string);
        expected.add(string1);
        expected.add(string2);
        expected.add(string3);
        expected.add(string4);
        expected.add(string5);
        expected.add(string6);
        return expected;
    }

    public String getText4() {
        String text = "Why did the Sahara die? " +
                "The answer lies in the history of monsoon rains that bring wetness from " +
                "western and central Africa into the Sahara.";
        return text;
    }

    public List<String> getExpectedStrings4() {
        List<String> expected = new ArrayList<>();
        String string = new String("in");
        String string1 = new String("of");
        String string2 = new String("history");
        String string3 = new String("monsoon");
        String string4 = new String("wetness");
        String string5 = new String("western");
        String string6 = new String("central");
        expected.add(string);
        expected.add(string1);
        expected.add(string2);
        expected.add(string3);
        expected.add(string4);
        expected.add(string5);
        expected.add(string6);
        return expected;
    }
}