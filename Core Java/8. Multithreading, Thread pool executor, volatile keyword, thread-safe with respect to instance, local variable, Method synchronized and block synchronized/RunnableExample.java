class Thread1 implements Runnable
{
    public void run()
    {
        for(int i=1;i<10;i++)
        {
            try
            {

            Thread.sleep(400);
            System.out.println( Thread.currentThread().getName());
            System.out.println(i*1000);
            }
            catch(Exception e)
            {}
        }
    }
}

class Thread2 implements Runnable
{
    public void run()
    {
        for(int i=1;i<10;i++)
        {
            try
            {
            Thread.sleep(400);
            System.out.println( Thread.currentThread().getName());
            System.out.println(i*100);
            }
            catch(Exception e)
            {}
        }
    }
}

class RunnableExample 
{
    public static void main(String args[])
    {
        Thread1 t1=new Thread1();
        Thread t=new Thread(t1);
        Thread2 t2=new Thread2();
        t.start();
        Thread tt=new Thread(t2);
        tt.start();


    }
}