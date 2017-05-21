package com.courses.apollo.collections;

import com.courses.apollo.model.ImmutableKeyExample;
import com.courses.apollo.model.Student;
import org.junit.Test;

import java.util.*;

/**
 * Created by User on 15.05.2017.
 */
public class MapTest {

    @Test
    public void testSimpleOperationsWithMap() {
        Map<String, String> map = new HashMap<>();
        map.put("A", "Test");
        Map<String, String> mapTwo = new HashMap<>();
        map.put("B", "Test");
        System.out.println(map.get("A"));
        System.out.println(map.get("B"));
        //map.clear();
        System.out.println(map.containsKey("A"));
        System.out.println(map.containsValue("B"));
        //map.isEmpty();
        map.putAll(mapTwo);
        System.out.println(map.size());
        System.out.println(map.remove("A"));
        System.out.println(map.size());
        System.out.println(map.remove("B", "TestTest"));
        System.out.println(map.size());
    }

    @Test
    public void testHashCodeEquals() {
        Student st = new Student();
        st.hashCode();
        int hash = hash("A");
        int positionInMap = (16 - 1) & hash;
        System.out.println(positionInMap);
        Map<String, String> map = new HashMap<>();
        map.put("A", "Test");
    }

    @Test
    public void testNonImmutableObject() {
        Date date = new Date(10000);
        int hash = hash(date);
        int positionInMap = (16 - 1) & hash;
        System.out.println(positionInMap);
        Map<Date, String> map = new HashMap<>();
        map.put(date, "Test");
        System.out.println(map.get(date));
        date.setTime(100);
        System.out.println(map.get(date));
    }

    @Test
    public void testImmutableObject() {
        ImmutableKeyExample key = new ImmutableKeyExample("A", new Date(10000));
        int hash = hash(key);
        int positionInMap = (16 - 1) & hash;
        System.out.println(positionInMap);
        Map<ImmutableKeyExample, String> map = new HashMap<>();
        map.put(key, "Test");
        System.out.println(map.get(key));
        key.getDate().setTime(10);
        System.out.println(map.get(key));
    }

    @Test
    public void testLinkedHashMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Abc", "Test");
        map.put("Bcd", "Test");
        map.put("Cfg", "Test");
        map.put("Ddfsdf", "Test");
        map.put("Efsdfd", "Test");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for(Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey());
        }
        System.out.println("----------------------");
        Map<String, String> mapLinked = new LinkedHashMap<>();
        mapLinked.put("Abc", "Test");
        mapLinked.put("Bcd", "Test");
        mapLinked.put("Cfg", "Test");
        mapLinked.put("Ddfsdf", "Test");
        mapLinked.put("Efsdfd", "Test");
        Set<Map.Entry<String, String>> entryLinkedSet = mapLinked.entrySet();
        for(Map.Entry<String, String> entry : entryLinkedSet) {
            System.out.println(entry.getKey());
        }
    }

    @Test
    public void testTreeMap() {
        Map<String, String> map = new TreeMap<>();
        map.put("A", "Test");
        map.put("W", "Test");
        map.put("Z", "Test");
        map.put("E", "Test");
        map.put("B", "Test");
        map.put("C", "Test");
        Set<Map.Entry<String, String>> entryLinkedSet = map.entrySet();
        for(Map.Entry<String, String> entry : entryLinkedSet) {
            System.out.println(entry.getKey());
        }
    }

    @Test
    public void setTest() {
        Set<String> set = new HashSet<>();
        set.add("A");
        boolean res = set.remove("A");
        System.out.println(res);
        System.out.println(set.size());
    }


    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
}
