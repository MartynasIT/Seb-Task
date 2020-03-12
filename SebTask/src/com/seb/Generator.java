package com.seb;

public class Generator {
    static String binaryA, binaryB;
    static int k = 0;
    static final int MULTIPLIER_A = 16807;
    static final int MULTIPLIER_B = 48271;
    static final int DIVIDER = 2147483647;

    public static long generator(long numberA, long numberB) {
        long generatedA = (numberA * MULTIPLIER_A) % DIVIDER;
        long generatedB = (numberB * MULTIPLIER_B) % DIVIDER;
        binaryA = Long.toBinaryString(generatedA);
        binaryB = Long.toBinaryString(generatedB);

        if (!binaryA.substring(binaryA.length() - 8).equals(binaryB.substring(binaryB.length() - 8))) {
            k++;
            return generator(generatedA, generatedB);
        }
        return k;
    }
}
