public class ThreadDemo {
    public static void main(String[] args) {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();
        obj1.start();
        try
        {
            Thread.sleep(10);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        obj2.start();
    }
}
