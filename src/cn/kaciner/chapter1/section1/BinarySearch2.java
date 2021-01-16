package cn.kaciner.chapter1.section1;

/**
 * @author Kaciner
 * @since 2021-01-16 12:53
 */

/**
 * 二分查找的递归实现
 */
public class BinarySearch2 {
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

    private static int rank(int key, int[] a, int lo, int hi) {
        //如果key存在于a[]中，它的索引不会小于lo且不会大于hi
        if(lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if(key < a[mid]) {
            return rank(key, a, lo, mid - 1);
        }else if(key > a[mid]) {
            return rank(key, a, mid + 1, hi);
        }else {
            return mid;
        }
    }


}
