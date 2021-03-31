package com.lcmandgcd;

/**
 * @author Jorge Andrés Valencia Jaramillo
 * @version v1.0
 * @since 2021-03-31
 *
 * This exercise is intended to calculate the Least Common Multiple (LCM) of 2 positive numbers.
 * It uses the fact that LCM(a, b) = (a·b)/GCD(a, b). GCD stands for Greatest Common Divisor.
 *
 * In order to find GCD(a, b), Euclid algorithm will be used because, in fact:
 *
 * GCD(a, b) = GCD(MIN(a, b), (MAX(a, b) % MIN(a, b)), understanding "%" as the operator which performs
 * the remaining of the division between 2 integer numbers a and b.
 *
 * As it is a recursive algorithm; next assumptions are made:
 *
 * GCD(0, 0) = 0
 * GCD(k, 0) = k; k > 0. This is the base case for recursion algorithm
 *
 * */

public class LcmGcd {

    public static void main(String[] args) {
        int a = 72;
        int b = 50;
        int lcm = lcm(a, b);
        System.out.format("LCM(%d, %d) = %d",a, b, lcm);
    }

    public static int lcm(int a, int b){
        if (a < 0 || b < 0) {
            throw new RuntimeException("Numbers should be greater than zero (0)");
        }
        else return (a * b) / gcd(a, b);
    }

    private static int gcd(int a, int b){
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        if(a == 0 || b == 0){
            return max;
        }
        else{
            return gcd(min, (max % min));
        }
    }
}
