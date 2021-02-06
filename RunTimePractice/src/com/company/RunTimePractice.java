package com.company;

import java.util.HashMap;

public class RunTimePractice {

    public static int findNumsOfRepetitions(String s, char c) {
        // linear time; 0(n) time
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                sum++;
            }
        }
        return sum;
    }

    public static int[] findNumsOfRepetitionsV1(String s, char[] c) {
        // Quad time; 0(n * m) time
        int[] sums = new int[c.length];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < c.length; j++) {
                if (s.charAt(i) == c[j]) {
                    sums[j] = sums[j] + 1;
                }
            }
        }
        return sums;
    }

    public static int[] findNumsOfRepetitionsV2(String s, char[] c) {
        // optimal time; 0(n + m)
        int[] sums = new int[c.length];
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                int sum = map.get(s.charAt(i));
                map.put(s.charAt(i), sum + 1);
            }
        }
        for (int j = 0; j < c.length; j++) {
            int sum;
            if (!map.containsKey(c[j])) {
                sums[j] = 0;
            } else {
                sums[j] = map.get(c[j]);
            }
        }
        return sums;
    }

    public static void main(String[] args) {
        // write your code
        long startTime = System.currentTimeMillis();
        System.out.println(findNumsOfRepetitions("abcafdfdhg", 'a'));
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Test: " + duration + "ms");

        char[] a = {'a', 'b', 'c', 'd', 'e', 'f', 'a', 'b', 'c', 'd', 'e', 'f', 'a', 'b', 'c', 'd', 'e', 'f'};

        startTime = System.currentTimeMillis();
        System.out.println(findNumsOfRepetitionsV1("abcafdfdhgkjakjpoijqkfnvkj kjakjfoija ij ijfaijijakjkjf akjaj k" +
                "kjaj ijaf kfkmakjfjfkjdaijf akmfckmajk qopjerkjkfjpoiajfma,fmmkjrjajfoipjafmññoijfkajfañjk", a));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test: " + duration + "ms");

        startTime = System.currentTimeMillis();
        System.out.println(findNumsOfRepetitionsV2("abcafdfdhgkjakjpoijqkfnvkj kjakjfoija ij ijfaijijakjkjf akjaj k" +
                "kjaj ijaf kfkmakjfjfkjdaijf akmfckmajk qopjerkjkfjpoiajfma,fmmkjrjajfoipjafmññoijfkajfañjk", a));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test: " + duration + "ms");
    }
}

//C:\Users\Win10Pro\Documents\cursos-programacion\RunTimePractice\src\com\company\RunTimePractice.java

/*
COMPLEJIDAD DEL TIEMPO DE FUNCIONAMIENTO
¿Qué tan rápido es una función dada basada en una entrada dada de tamaño N.
*/
