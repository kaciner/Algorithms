package cn.kaciner.chapter1.section2;

/**
 * @author Kaciner
 * @since 2021-01-16 16:31
 */
public class StringTest {
    //判断字符串是否是回文字符串
    public static boolean isPalindrome(String s) {
        int N = s.length();
        for (int i = 0; i < N / 2; i++) {
            if (s.charAt(i) != s.charAt(N - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    //检查一个字符串数组中的元素是否已经按照字母表顺序排列
    public boolean isSorted(String[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1].compareTo(a[i]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = s1.intern();
        s1 = "world";
        System.out.println(s1);
        System.out.println(s2);
    }
}
