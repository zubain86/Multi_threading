public class ThreadDemoRunnable {
    public static void main(String[] args) {
        Runnable obj1 = new HiRunnable();
        Runnable obj2 = new HelloRunnable();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        try {
            Thread.sleep(10);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        t2.start();
    }
}
