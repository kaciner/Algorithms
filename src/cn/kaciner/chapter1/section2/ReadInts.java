package cn.kaciner.chapter1.section2;

import java.util.Scanner;

/**
 * @author Kaciner
 * @since 2021-01-16 18:34
 */
public class ReadInts {
    public static int[] readInts(String name) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] words = s.split("\\s+");
        int[] ints = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            ints[i] = Integer.parseInt(words[i]);
        }
        return ints;
    }
}
