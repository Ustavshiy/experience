package com.courses.apollo.model.figure;

import com.courses.apollo.model.IntegerStringVocabulary;
import com.courses.apollo.model.Patient;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 20.04.2017.
 */
public class IntegerStringVocabularyTest {

    public void test(){
        IntegerStringVocabulary integerStringVocabularyOne
                = new IntegerStringVocabulary(1, "word");
        IntegerStringVocabulary integerStringVocabularyTwo
                = new IntegerStringVocabulary(2, "letter");
        IntegerStringVocabulary integerStringVocabularyThree
                = new IntegerStringVocabulary("vasya"
                , new Patient(null,null
                ,null));

        List<IntegerStringVocabulary> vocabularyList = new ArrayList<>();
        vocabularyList.add(integerStringVocabularyOne);
        vocabularyList.add(integerStringVocabularyTwo);
        vocabularyList.add(integerStringVocabularyThree);


        for (IntegerStringVocabulary vocabulary : vocabularyList){
            if (Integer.valueOf(vocabulary.getKey().toString()) == 2){
                System.out.println(vocabulary.getWord());
            }
        }
    }
}
