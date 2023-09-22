public class Consumer implements Runnable {
    Q q;

    public Consumer(Q q) {
        this.q = q;
        Thread t = new Thread(this,"Consumer");
        t.start();
    }
    public void run()
    {
        q.get();
        try
        {
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

}
