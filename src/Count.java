public class Count {
    int count;
    //It tells that the method is thread safe
    //Multiple threads will not access the method
    //One thread will access the method at one time
    public synchronized void increment()
    {
        count++;
    }
}
