class ThreadExample extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try
            {
            Thread.sleep(400);
            System.out.println("2*"+i+"="+(2*i));
            }
            catch(Exception e)
            {}
            
        }

    }
}

class ThreadExample2 extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try
            {
            Thread.sleep(400);
            System.out.println("100*"+i+"="+(100*i));
            }
            catch(Exception e)
            {}
            
        }

    }

}

class SimpleThread 
{
    public static void main(String args[])
    {
        ThreadExample t=new ThreadExample();
        ThreadExample2 t1=new ThreadExample2();

        t.start();
        t1.start();
    }
}