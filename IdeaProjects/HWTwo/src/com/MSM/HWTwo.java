package com.MSM;

public class HWTwo {

    public static void main(String[] args) {
        // write your code here
        String input = args[0];
        int[] initialDigits = new int[11];
        int result;

        for (int i = 0; i < 11; i++) {
            initialDigits[i] = input.charAt(i) - '0';
        }
        result = (10 - (((initialDigits[0] * 3) + initialDigits[1] + (initialDigits[2] * 3) + initialDigits[3] + (initialDigits[4] * 3) + initialDigits[5] + (initialDigits[6] * 3) + initialDigits[7] + (initialDigits[8] * 3) + initialDigits[9] + (initialDigits[10] * 3)) % 10)) % 10;
        System.out.println(input);
        System.out.println(result);
    }
}
