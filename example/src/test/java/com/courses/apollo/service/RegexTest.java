package com.courses.apollo.service;

import org.junit.Test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

    @Test
    public void testRegexp() {
        String test = "Ivan Ivanov";
        System.out.println(test.matches("\\w+\\s\\w+"));
        System.out.println("van".matches("van"));
        System.out.println("miIvan".matches("[^A-Z{1,2}]\\w+"));
        System.out.println("1223354".matches("\\D+"));
    }

    @Test
    public void testMatcher() {
        // поиск и выбор подстроки, заданной шаблоном
        String regex = "(\\w{6,})@(\\w+\\.)([a-z]{2,4})";
        String s = "адреса эл.почты:blinov@gmail.com, romanchik@bsu.by!";
        Pattern p2 = Pattern.compile(regex);
        Matcher m2 = p2.matcher(s);
        while (m2.find()) {
            System.out.println("e-mail: " + m2.group());
        }
// разбиение строки на подстроки с применением шаблона в качестве разделителя
        Pattern p3 = Pattern.compile("\\d+\\s?");
        String[] words = p3.split("java5tiger 77 java6mustang");
        System.out.print(Arrays.toString(words));
    }

}
