//Write a program which create two threads and then generates numbers from 15 to 1 for the delay of 1sec between them. Display the thread details for the current thread and changed thread name to thread1 to “San” and thread2 to “Bag”.
//By: Parth Panjwani
class Que39
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread t1=new Thread(new Runnable()
        {
            public void run()
            {
                for(int i=15;i>=1;i--)
                {
                    System.out.println(i);
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e)
                    {
                        System.out.println("Thread interrupted");
                    }
                }
            }
        });
        Thread t2=new Thread(new Runnable()
        {
            public void run()
            {
                for(int i=15;i>=1;i--)
                {
                    System.out.println(i);
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e)
                    {
                        System.out.println("Thread interrupted");
                    }
                }
            }
        });
        t1.start();
        t2.start();
        t1.setName("San");
        t2.setName("Bag");
        System.out.println("Current thread name is "+Thread.currentThread().getName());
        System.out.println("Thread1 name is "+t1.getName());
        System.out.println("Thread2 name is "+t2.getName());
    }
}