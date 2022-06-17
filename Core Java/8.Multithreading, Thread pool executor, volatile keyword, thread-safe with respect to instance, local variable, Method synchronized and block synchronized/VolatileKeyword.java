public class VolatileKeyword {
    
    private static volatile int MY_INT = 0;
   
    public static void main(String[] args)
    {
        new ChangeListener().start();
        new ChangeMaker().start();
    }
   
   
    static class ChangeListener extends Thread {
        public void run()
        {
            int local_value = MY_INT;
            while (local_value < 5) {
                if (local_value != MY_INT) {
                    System.out.println("Got Change for MY_INT : "+MY_INT);
                    local_value = MY_INT;
                }
            }
        }
    }
   
    static class ChangeMaker extends Thread {
        public void run()
        {
            int local_value = MY_INT;
            while (MY_INT < 5) {
                System.out.println("Incrementing MY_INT to "+local_value);
                MY_INT = ++local_value;
                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

/*NOTE:
Using volatile is yet another way (like synchronized, atomic wrapper) of making class thread-safe.
Thread-safe means that a method or class instance can be used by multiple threads at the same time without any problem.
*/