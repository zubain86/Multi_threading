public class Q {
    int num;
    boolean valueSet = false;
    public synchronized void set(int num)
    {
        while(valueSet)
        {
         try
         {
             wait();
         }
         catch (Exception e)
         {
             System.out.println(e);
         }
        }
        System.out.println("Set value is "+ num);
        this.num = num;
        valueSet = true;
        notify();

    }
    public synchronized void get()
    {

        while (!valueSet)
        {
            try
            {
                wait();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        System.out.println("Get value is "+num);
        valueSet = false;
        notify();

    }
}

