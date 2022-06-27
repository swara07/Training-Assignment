class Pattern
{
    public void printPattern(int n)
    {
        synchronized(this)
        {
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
            {
                
                try
                {
                    Thread.sleep(400);
                    System.out.print("*");
                }
                catch(Exception e)
                {}
            }
            System.out.println();
            }
            
        }
    }
}

class SynchronizationBlock extends Thread
{
    public static void main(String args[])
    {
    Pattern p=new Pattern();
    Thread t1=new Thread()
    {
        public void run()
        {
            p.printPattern(4);
        }

    };

    Thread t2=new Thread()
    {
        public void run()
        {
            p.printPattern(8);
        }
        
    };

    t1.start();
    t2.start();
    }
}