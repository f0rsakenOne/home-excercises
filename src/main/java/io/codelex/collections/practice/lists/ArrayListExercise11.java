package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("hard");
        arrayList.add("week");
        arrayList.add("working");
        arrayList.add("upgrade");
        arrayList.add("We");
        arrayList.add("game");
        arrayList.add("testing");
        arrayList.add("latest");
        arrayList.add("restricting");
        arrayList.add("access");
        arrayList.add("cycle");

        arrayList.add(5, "base");

        arrayList.set(arrayList.size() - 1, "rolls");

        Collections.sort(arrayList);

        if (arrayList.contains("Foobar")) {
            System.out.println("Contains");
        } else {
            System.out.println("Does not contain");
        }

        for (String i : arrayList) {
            System.out.println(i);
        }
    }

}
