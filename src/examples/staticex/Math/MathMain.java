package examples.staticex.Math;

public class MathMain {
    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5};

        int total = MathUtil.sum(array);
        System.out.println(total);

        total = MathUtil.average(array);
        System.out.println(total);

        total = MathUtil.min(array);
        System.out.println(total);

        total = MathUtil.max(array);
        System.out.println(total);
    }
}
