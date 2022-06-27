class Student
{
    private String name;
    int age;
    
    //setter methods
    void setAge(int a)
    {
        age=a;
    }
    void setName(String a)
    {
        name=a;
    }

    //getter methods
    int getAge()
    {
        return age;
    }

    String getName()
    {
        return name;
    }

    
}

class Encapsulation
{
    public static void main(String args[])
    {
        Student s=new Student();
        s.setName("Swarangi");
        s.setAge(22);
        System.out.println("Name : "+s.getName());
        System.out.println("Age : "+s.getAge());

}
}