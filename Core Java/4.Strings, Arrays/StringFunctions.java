class StringFunctions
{
    public static void main(String args[])
    {
        String name="Swarangi";
        String lastname="Dali";

        //1. charAt()
        System.out.println("The char at 5th position of name is "+name.charAt(4));

        //2. substring()
        System.out.println("The substring of name is "+name.substring(1,4));

        //3. length()
        System.out.println("The length of name string is "+name.length());

        //4. toUpperCase()
        System.out.println("The uppercase of name string is "+name.toUpperCase());

        //5. trim() : removes extra whitespaces
        String text="Look at the reality     ";
        System.out.println(text.trim()+" trimmed text");


        //6. equals()
        if(name.equals(lastname))
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");

        //7. contains()
        System.out.println("Does Swarangi contains x?");
        if(name.contains("x"))
            System.out.println("yes");
        else
            System.out.println("no");

        //8.concat()
        System.out.println("Concationation of name and lastname : "+name.concat(lastname));

        //9. replace()
        System.out.println("before  :"+name +" After replacing: "+name.replace('a','x'));

    }
}

//NOTE : String class is immutable and therefore a Final class