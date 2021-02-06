package com.company;

/*import java.util.Scanner;*/


/*
Find Intersection
Have the function FindIntersection(strArr) read the array of strings stored in strArr which will contain 2 elements:
the first element will represent a list of comma-separated numbers sorted in ascending order, the second element will
represent a second list of comma-separated numbers (also sorted). Your goal is to return a comma-separated string
containing the numbers that occur in elements of strArr in sorted order. If there is no intersection, return the
string false.

Examples
Input: new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}
Output: 1,4,13

Input: new String[] {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"}
Output: 1,9,10

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static String FindIntersection(String[] strArr) {

        String result = "";

        String[] arrayOne = strArr[0].split(",");
        String[] arrayTwo = strArr[1].split(",");

        for (String i: arrayOne){
            for (String j: arrayTwo){
                if (i.equals(j)){
                    result += i.trim() + ",";
                }
            }
        }
        result = result.substring(0, result.length() - 1);
        return result;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String[] input = {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"};

        System.out.println(FindIntersection(input));


    }
}
