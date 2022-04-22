//Generate 3 threads each generating numbers from 1 to 5 and set the priority of 4 threads to maximum , normal and minimum and display the output.
//By: Parth Panjwani
class Que42 { 
    public static void main(String[] args) { 
        Thread t1 = new Thread(new Runnable() { 
            public void run() { 
                for(int i=1;i<=5;i++)
                {
                    System.out.println(i);
                }
            } 
        }); 
        Thread t2 = new Thread(new Runnable() { 
            public void run() { 
                for(int i=1;i<=5;i++)
                {
                    System.out.println(i);
                }
            } 
        }); 
        Thread t3 = new Thread(new Runnable() { 
            public void run() { 
                for(int i=1;i<=5;i++)
                {
                    System.out.println(i);
                }
            } 
        }); 
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start(); 
        t2.start(); 
        t3.start();
    } 
}