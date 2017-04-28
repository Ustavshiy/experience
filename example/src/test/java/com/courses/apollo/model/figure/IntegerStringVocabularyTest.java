package com.courses.apollo.model.figure;

import com.courses.apollo.model.VocabularyPair;
import com.courses.apollo.model.Patient;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 20.04.2017.
 */
public class IntegerStringVocabularyTest {

    public void test(){
        VocabularyPair<Integer, String> integerStringVocabularyOne
                = new VocabularyPair<>(1, "word");
        VocabularyPair<Integer, String> integerStringVocabularyTwo
                = new VocabularyPair<>(2, "letter");

        VocabularyPair<String, Patient> integerStringVocabularyThree
                = new VocabularyPair<>("vasya"
                , new Patient(null,null
                ,null));

        List<VocabularyPair<Integer, String>> vocabularyList = new ArrayList<>();
        vocabularyList.add(integerStringVocabularyOne);
        vocabularyList.add(integerStringVocabularyTwo);

    }
}
