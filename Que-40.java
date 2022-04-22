//Create 2 threads with the first thread generating numbers from 5 to 1 with a delay of 0.5sec and second thread generates numbers from 5 to 1 with a delay of 1sec.
//By: Parth Panjwani
class Que40
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread t1=new Thread(new Runnable()
        {
            public void run()
            {
                for(int i=5;i>=1;i--)
                {
                    System.out.println(i);
                    try
                    {
                        Thread.sleep(500);
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
                for(int i=5;i>=1;i--)
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
    }
}