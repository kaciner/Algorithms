package cn.kaciner.chapter1.section2;

/**
 * @author Kaciner
 * @since 2021-01-16 19:17
 */
public class Accumulator
{
    private double m;
    private double s;
    private int n;

    public void addDataValue(double val)
    {
        n++;
        s = s + 1.0 * (n - 1) / n * (val - m) * (val - m);
        m = m + (val - m) / n;
    }

    public double mean()
    {
        return m;
    }

    public double var()
    {
        return s / (n - 1);
    }

    public double stddev()
    {
        return Math.sqrt(this.var());
    }

    public String toString()
    {
        return String.format("%.5f %.5f", mean(), stddev());
    }
}

