package com.courses.apollo;

import com.courses.apollo.model.Student;
import com.courses.apollo.model.University;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created by User on 09.03.2017.
 */
public class TestStudentService {

    @Test
    public void testStudentsInGroup() {
        final String courseToFind = "B";
        ArrayList<University> universities = StudentTestData.getUniversities();
        for (int i = 0; i < universities.size(); i++) {
            University university = universities.get(i);
            for (int j = 0; j < university.getStudents().size(); j++) {
                Student student = university.getStudents().get(j);
                if(student.getUniversityInfo() != null && courseToFind.equals(student.getUniversityInfo().getFaculty())) {
                    System.out.println(student.getName());
                }
            }
        }
    }

    @Test
    public void testEquals() {
        Student test = new Student(
                "Ivan",
                "Ivaneko",
                1, "A");
        ArrayList<Student> students = StudentTestData.getStudentArrayList();
        Assert.assertTrue(students.contains(test));
    }

    @Test
    public void testArrayListMethods() {
        //elementData and size
        ArrayList<String> stringArrayList = new ArrayList<>();
        System.out.println(stringArrayList.size());//[].length == ArrayList.size()
        stringArrayList.add("A");
        System.out.println(stringArrayList.size());
        stringArrayList.add("B");
        System.out.println(stringArrayList.size());
        String a = stringArrayList.get(0);
        System.out.println(a);
        //String unknown = stringArrayList.get(2);//java.lang.IndexOutOfBoundsException
        //System.out.println(unknown);
        stringArrayList.add(0, "C");
        String something = stringArrayList.get(0);
        System.out.println(something);
        stringArrayList.add(3, "Z");
        String z = stringArrayList.get(3);
        System.out.println(z);
        //stringArrayList.add(5, "Y");
        //String unknown = stringArrayList.get(5);//java.lang.IndexOutOfBoundsException
        //System.out.println(unknown);
        stringArrayList.set(0, "I");//replace
        String i = stringArrayList.get(0);
        System.out.println(i);
        System.out.println(stringArrayList);//[I, A, B, Z]
        stringArrayList.remove(0);
        String iRemove = stringArrayList.get(0);//Return A
        System.out.println(iRemove);//I
        stringArrayList.remove("A");
        String aRemove = stringArrayList.get(0);
        System.out.println(aRemove);
        stringArrayList.add("A");
        stringArrayList.add("A");
        stringArrayList.remove("A");
        aRemove = stringArrayList.get(stringArrayList.size() - 1);//get Last
        System.out.println(aRemove);
        System.out.println(stringArrayList);
        boolean isDPresent = stringArrayList.contains("D");
        System.out.println(isDPresent);
        ArrayList<String> stringArrayListTwo = new ArrayList<>();
        stringArrayListTwo.add("D");
        stringArrayListTwo.add("W");
        stringArrayList.addAll(stringArrayListTwo);
        System.out.println(stringArrayList);
        ArrayList<String> stringArrayListRemove = new ArrayList<>();
        stringArrayListRemove.add("B");
        stringArrayList.removeAll(stringArrayListRemove);
        System.out.println(stringArrayList);
        stringArrayList.add("B");
        stringArrayList.add("B");
        stringArrayList.removeAll(stringArrayListRemove);
        System.out.println(stringArrayList);
        //stringArrayList.clear();//Remove all elements
        stringArrayList.ensureCapacity(200);
        System.out.println(stringArrayList.size());
        stringArrayList.add("Z");
        int indexZ = stringArrayList.indexOf("Z");
        System.out.println(indexZ);
        boolean isEmpty = stringArrayList.isEmpty();
        System.out.println(stringArrayList);
        System.out.println(isEmpty);
        int lastIndexZ = stringArrayList.lastIndexOf("Z");
        System.out.println(lastIndexZ);
        ArrayList<String> retainList = new ArrayList<>();
        retainList.add("Z");
        retainList.add("A");
        stringArrayList.retainAll(retainList);
        System.out.println(stringArrayList);
        stringArrayList.add("W");
        stringArrayList.add("G");
        stringArrayList.add("O");
        System.out.println(stringArrayList);
        List<String> subList = stringArrayList.subList(3, 6);
        System.out.println(subList);
        String[] array = stringArrayList.toArray(new String[stringArrayList.size()]);
        System.out.println(array.length);

    }
}
