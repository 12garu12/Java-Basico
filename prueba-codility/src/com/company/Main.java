package com.company;

public class Main {

    public int solution(int A, int B) {
        // write your code in Java SE 8
        Integer C = A * B;
        String numbina = Integer.toBinaryString(C);
        String[] arr = numbina.split("");
        int cont = 0;
        for (String s : arr) {
            if(s.equals("1")){
                cont++;
            }
        }
        return cont;
    }

    public String solution(int T) {
        // write your code in Java SE 8
        int secondsTotal = T;
        int hours = secondsTotal / 3600;
        float sobra = secondsTotal % 3600f;
        int minutes = (int)sobra / 60;
        int seconds= (int) sobra % 60;

        String time = hours + "h" + minutes + "m" + seconds + "s";
        return time;
    }




    public static void main(String[] args) {
	// write your code here

        Main a = new Main();

        int secondsTotal = 83643;
        int hours = secondsTotal / 3600;
        float sobra = secondsTotal % 3600f;
        int minutes = (int)sobra / 60;
        int seconds= (int) sobra % 60;

        String time = hours + "h" + minutes + "m" + seconds + "s";


        System.out.println(time);




    }
}
