/*Note: 
Java Thread pool represents a group of worker threads that are waiting for the job and reused many times.
In the case of a thread pool, a group of fixed-size threads is created. A thread from the thread pool is pulled out and assigned a job by the service provider. After completion of the job, the thread is contained in the thread pool again.
*/

import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  

class WorkerThread implements Runnable {  
    private String message;  
    public WorkerThread(String s){  
        this.message=s;  
    }  
     public void run() {  
        System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);  
        processmessage();//call processmessage method that sleeps the thread for 2 seconds  
        System.out.println(Thread.currentThread().getName()+" (End)");//prints thread name  
    }  
    private void processmessage() {  
        try 
        {  
            Thread.sleep(2000);  
        } 
        catch (InterruptedException e) 
        { 
            e.printStackTrace(); 
        }  
    }  
}  

public class ThreadPoolExample {  
     public static void main(String[] args) 
     {  
        ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads  
        for (int i = 0; i < 10; i++) 
        {  
            Runnable worker = new WorkerThread("" + i);  
            executor.execute(worker);//calling execute method of ExecutorService  
        }  
        executor.shutdown();  
        while (!executor.isTerminated()) {   }  
  
        System.out.println("Finished all threads");  
    }  
 }  