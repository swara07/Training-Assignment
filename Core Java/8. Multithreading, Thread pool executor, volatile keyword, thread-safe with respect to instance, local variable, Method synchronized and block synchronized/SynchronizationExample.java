class Table
{
    synchronized void printTable(int n)
    {
        for(int i=1;i<10;i++)
        {
            try
            {
            Thread.sleep(400);
            System.out.println(n*i);
            }
            catch(Exception e)
            {}
        }
    }
}


class Thread1 extends Thread
{
    Table t;
    Thread1(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printTable(10);
    }
}

class Thread2 extends Thread
{
    Table t;
    Thread2(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printTable(45);
    }
}


class SynchronizationExample 
{
    public static void main(String args[])
    {
        Table t=new Table();
        Thread1 t1=new Thread1(t);
        Thread2 t2=new Thread2(t);
        t1.start();
        t2.start();
    }
}