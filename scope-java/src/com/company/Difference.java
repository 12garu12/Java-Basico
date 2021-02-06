package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Difference {

    private int[] elements;
    public int maximumDifference;
    public ArrayList<Integer> elements2 = new ArrayList<>();

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        for (int i = 0; i < elements.length; i++) {
            elements2.add(elements[i]);
        }
        Collections.sort(elements2);
        int elementZ = elements2.get(elements2.size() - 1);
        int elementA = elements2.get(0);
        maximumDifference = Math.abs(elementA - elementZ);
    }
}
