package cn.kaciner.chapter1.section2;

/**
 * @author Kaciner
 * @since 2021-01-16 18:25
 */
public class CircularRotation {
    public static boolean isCircularRotation(String s, String t) {
        return s.length() == t.length() && (s + s).indexOf(t) >= 0;
    }
}
