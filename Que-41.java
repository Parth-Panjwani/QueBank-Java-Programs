//Consider the equation p= sinx + cosy+ tanz , Create 3 threads with each one computing sinx, cosy, tanz . Obtain the sum of 3 terms and display. 
//By: Parth Panjwani
class Que41 { 
    public static void main(String[] args) { 
        Thread t1 = new Thread(new Runnable() { 
            public void run() { 
                System.out.println("Sinx: "+Math.sin(Math.PI/2)); 
            } 
        }); 
        Thread t2 = new Thread(new Runnable() { 
            public void run() { 
                System.out.println("Coxy: "+Math.cos(Math.PI/2)); 
            } 
        }); 
        Thread t3 = new Thread(new Runnable() { 
            public void run() { 
                System.out.println("Tanz: "+Math.tan(Math.PI/2)); 
            } 
        }); 
        
        t1.start(); 
        t2.start(); 
        t3.start();
         
    } 
}