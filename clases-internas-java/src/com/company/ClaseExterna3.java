package com.company;

public class ClaseExterna3 {

    int nums[];

    ClaseExterna3(int n[]) {
        nums = n;
    }

    void analizar() {
        Interna inOb = new Interna();
        System.out.println("Minimo: " + inOb.min());
        System.out.println("Máximo: " + inOb.max());
        System.out.println("Promedio: " + inOb.promedio());
    }

    //Esta es una clase interna
    class Interna {
        int min() {
            int m = nums[0];
            for (int i = 1; i < nums.length; i++)
                if (nums[i] < m) m = nums[i];
            return m;
        }

        int max() {
            int m = nums[0];
            for (int i = 1; i < nums.length; i++)
                if (nums[i] > m) m = nums[i];
            return m;
        }

        int promedio() {
            int a = 0;
            for (int i = 0; i < nums.length; i++)
                a += nums[i];
            return a / nums.length;
        }
    }

}




