//final keyword is used when the value of the vairiable cannot be changed or updated

class FinalKeyword
{

final int age=18;

public static void main(String args[])
{
    FinalKeyword fk=new FinalKeyword();
    System.out.println(fk.age);
    fk.age=20;
    System.out.println(fk.age);

}
}

//NOTE: This program will give error as we are trying to update the value of the final variable age 