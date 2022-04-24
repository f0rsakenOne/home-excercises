package io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, array);
        System.out.println(arrayList);

        HashSet<String> hashSetArray = new HashSet<>(Arrays.asList(array));
        System.out.println(hashSetArray);

        HashMap<String, String> hashMapArray = new HashMap<>();
        for (String s : array) {
            switch (s) {
                case "Audi", "BMW", "Mercedes", "VolksWagen" -> hashMapArray.put(s, "Germany");
                case "Honda" -> hashMapArray.put(s, "Japan");
                case "Tesla" -> hashMapArray.put(s, "USA");
            }
        }
        System.out.println(hashMapArray);
    }
}
