package org.example;

public class SumCompare {
    public static void main(String[] args) {
        int value1 = 2;
        int value2 = 4;
        int value3 = 6;
        int value4 = 8;

        int sum1 = value1 + value2;
        int sum2 = value3 + value4;

        System.out.println("sum1 > sum2 - " + (sum1 > sum2));

        sum1++;
        sum2 -= 2;

        System.out.println("sum1 > sum2 - " + (sum1 > sum2));

        boolean EvenCheck = (sum1 % 2 == 0) || (sum2 % 2 == 0);
        System.out.println("sum1 or sum2 is even - " + EvenCheck);
    }
}

