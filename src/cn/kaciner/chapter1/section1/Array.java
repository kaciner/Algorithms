package cn.kaciner.chapter1.section1;

import java.util.Arrays;

/**
 * @author Kaciner
 * @since 2021-01-16 11:08
 */

public class Array {
    //找出数组中最大元素
    public double findMax(double[] a) {
        double max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    //计算数组元素的平均值
    public double findAverage(double[] a) {
        int N = a.length;
        double sum = 0.0;
        for (int i = 0; i < N; i++) {
            sum += a[i];
        }
        double average = sum / N;
        return average;
    }

    //复制数组
    public double[] copyArray(double[] a) {
        int N = a.length;
        double[] b = new double[N];
        for (int i = 0; i < N; i++) {
            b[i] = a[i];
        }
        return b;
    }

    //颠倒数组元素的顺序
    public void reverseArray(double[] a) {
        int N = a.length;
        for (int i = 0; i < N / 2; i++) {
            double temp = a[i];
            a[i] = a[N - 1 - i];
            a[N - 1 - i] = temp;
        }
    }

    //矩阵相乘
    public static double[][] matrix(double[][] a, double[][] b) {
        int N = a.length;
        double[][] c = new double[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                //计算行i和列j的点乘
                for (int k = 0; k < N; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }

}
