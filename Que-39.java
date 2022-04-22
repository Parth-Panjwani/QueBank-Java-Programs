//Write a program which create two threads and then generates numbers from 15 to 1 for the delay of 1sec between them. Display the thread details for the current thread and changed thread name to thread1 to “San” and thread2 to “Bag”.
//By: Parth Panjwani
class myThread extends Thread {
    public void run() {
        synchronized (myThread.class){
            System.out.println( "\n" + this.getName() );
            for( int i=15; i>=0; i-- ){
                System.out.print(i + " ");
                try{
                    this.sleep(1000);
                }
                catch(Exception e){
                    System.out.println("ERROR");
                }
            }
        }
    };
}


public class Main9 {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        myThread t2 = new myThread();

        t1.setName("San");
        t2.setName("Bag");

        t1.start();
        t2.start();
    }
}
