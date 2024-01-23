package examples.staticex.Math;

public class MathUtil {

    private static int total;
    public static int sum(int array[]) {
        total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }

    public static int average(int array[]) {
        return sum(array) / array.length;
    }

    public static int min(int array[]) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int max(int array[]) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
