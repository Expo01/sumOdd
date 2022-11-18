package com.company;

public class Main {

    public static void main(String[] args) {
        int finalSum = sumOdd(5, 9);
        System.out.println("final sum is " + finalSum);
    }

    public static boolean isOdd(int testNum) {
        if (testNum % 2 != 0 && testNum > 0) {
            return true;
        } else return false;
    }

    public static int sumOdd(int start, int end) {
        int oddSum = 0;
        if (start < 0 || end < 0 || end < start) {
            return -1;
        } else {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    System.out.println(i + " is an odd number");
                    oddSum += i;
                }
            }
            return oddSum;
        }
    }

}
