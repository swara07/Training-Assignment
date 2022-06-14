class Student
{
    int id;
    String name;

    //function to get data
    void getinfo(int x, String y)
    {
        id=x;
        name=y;
    }

    //function to display data
    void display()
    {
        System.out.println("name="+name);
        System.out.println("id="+id);
    }

}

class Methods
{
    public static void main(String args[])
    {

        Student st=new Student();

        //calling function using object
        st.getinfo(1,"Swara");
        st.display();
    }
}


