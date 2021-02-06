package com.company.multicatch;

public class Multicatch {

    public static void main(String[] args) {

        int a = 28, b = 0, result;

        char[] chars = {'A', 'B', 'C'};

        for (int i = 0; i < 2; i++) {
            try {
                if (i == 0){
                    result = a / b; // Genera un ArithmeticException
                }else {
                    chars[3] = 'X'; // Genera un ArrayIndexOutOfBoundsException
                }
            }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
                System.out.println("Excepción capturada: " + e);
            }
        }

        System.out.println("Después del multi-catch.");

    }

}
