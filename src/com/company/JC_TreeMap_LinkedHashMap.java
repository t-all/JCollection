package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class JC_TreeMap_LinkedHashMap {

    public Map<Integer, String> printTL() {

        Map<Integer, String> hashMap = new HashMap<>(); // внутри не гарантируется порядок пар
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); // в каком порядке пары ключ/значение в таком и вернутся
        Map<Integer, String> treeMap = new TreeMap<>(); // пары отсортированы по ключу (естественный порядок)

//        testMap(hashMap);
//        testMap(linkedHashMap);
        testMap(treeMap);


        return null;
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(39, "Bob");
        map.put(12, "Tom");
        map.put(45, "Mike");
        map.put(11, "Sam");
        map.put(0, "Tim");
        map.put(431, "Bob");

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
