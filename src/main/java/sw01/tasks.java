package main.java.sw01;
public class tasks {
    
    public static final int FACTOR = 1;

    public static void task(final int n) throws InterruptedException {
        task1(); task1(); task1(); task1();
        for (int i = 0; i < n; i++) {
            task2(); task2(); task2();
            for (int j = 0; j < n; j++) {
                task3(); task3();
            }
        }
    }
    
    private static void task1() throws InterruptedException{
        Thread.sleep(5 * FACTOR);
        //System.out.println("TASK 1 called times");
    }
    
    
    private static void task2() throws InterruptedException {
        Thread.sleep(10 * FACTOR);
        //System.out.println("TASK 2 called times");
    }
    
    private static void task3() throws InterruptedException {
        Thread.sleep(15 * FACTOR);
        //System.out.println("TASK 3 called times");
    }

    public static void main(String[] args) {
        try {
            long time = System.currentTimeMillis();
            task(4);
            System.out.println(System.currentTimeMillis() - time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}