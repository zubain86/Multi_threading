public class Producer implements Runnable {
    Q q;

    public Producer(Q q) {
        this.q = q;
        Thread t  = new Thread(this,"Producer");
        t.start();
    }
    public void run()
    {
        int i = 0;
        while (true)
        {
            q.set(i++);
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
}
