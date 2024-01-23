package examples.capsulation.ex2;

public class MaxCounter {

    private int count;
    private int max;
    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment(int num) {
        if (count >= max) {
            System.out.println("max값을 초과했습니다.");
            return;
        }
        count++;
    }

    public int getCount() {
        return count;
    }
}
