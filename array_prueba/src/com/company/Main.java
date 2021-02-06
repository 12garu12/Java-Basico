package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static  List<Long> arrayChallenge(List<Long> arr){
        List<Long> n = new ArrayList<>();
        Long start = (long) 0;
        n.add(start);
        int a = arr.toArray().length;
        System.out.println(a);
        for (Long i: arr){
            for (int j = 2; j < a; j++){
                n.add(arr.get() )
            }

        }
        return arr;
    }

    public static void main(String[] args) {

        List<Long> arr = new ArrayList<>();
        arr.add((long) 1);
        arr.add((long) 2);
        arr.add((long) 2);
        arr.add((long) 3);

        arrayChallenge(arr);

    }
}
