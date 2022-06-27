import java.util.*;
interface Vehicle
{
    
    void maxSpeed();
    void getRate();

}

class Bike implements Vehicle
{
    public void maxSpeed()
    {
        int noOfWheels=2;
        System.out.println("Max Speed is 120 km/hr");
        System.out.println("No of wheels:"+noOfWheels);
    }

    public void getRate()
    {
        System.out.println("Amount Rs 300 per day");
    }
}

class Car implements Vehicle
{
    
    public void maxSpeed()
    {
        int noOfWheels=4;
        System.out.println("Max Speed is 200 km/hr");
        System.out.println("No of wheels:"+noOfWheels);
    }
    public void getRate()
    {
        System.out.println("Amount Rs 900 per day");
    }
}

class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    
        
        String mode;
        System.out.println("Enter mode of transport");
        mode=sc.next();

        if(mode.equals("car"))
        {
            Car c=new Car();
            c.maxSpeed();
            c.getRate();

        }

        else if(mode.equals("bike"))
        {    
            Bike b=new Bike();
            b.maxSpeed();
            b.getRate();

        }
    }
}