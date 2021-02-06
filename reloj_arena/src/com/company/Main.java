package com.company;

public class Main {

    public static void main(String[] args) {


        int[][] arr = {
                {0, - 4, - 6, 0, - 7, - 6},
                {-1, - 2, - 6, - 8, - 3, - 1},
                {-8, - 4, - 2, - 8, - 8, - 6},
                {-3, - 1, - 2, - 5, - 7, - 4},
                {-3, - 5, - 3, - 6, - 6, - 6},
                {-3, - 6, 0, - 8, - 6, - 7}};

        int adition = 0;
        int result = -9 * 36;
        for (int i = 0; i <= 3; i++){
            for( int j = 0; j <= 3; j++){
                adition = arr[i][j] + arr[i][1 + j] + arr[i][2 + j] +
                                 arr[1 + i][1 + j] +
                        arr[2 + i][j] + arr[2 + i][1 + j] + arr[2 + i][2 + j];
                if (adition > result){
                    result = adition;
                }
            }
        }
        System.out.println(result);


    }
}

