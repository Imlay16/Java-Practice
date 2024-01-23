package examples.capsulation.ex2;

public class MaxCounterMain {

    public static void main(String[] args) {
        MaxCounter maxCounter = new MaxCounter(10);
        maxCounter.increment(5);
        System.out.println("현재 카운트 값: " + maxCounter.getCount());

        maxCounter.increment(-1);
        maxCounter.increment(6);
        maxCounter.increment(5);
    }
}
