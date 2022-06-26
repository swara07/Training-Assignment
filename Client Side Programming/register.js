function validate() 
{
    var z=true;
    var letters = /^[A-Za-z]+$/;
    var name=document.getElementById("name");
    if(name.value.match(letters))
    {

    }
    else
    {
        alert("Name should contain alphabets only");
        z=false;
    }

    var phone=document.getElementById("phone").value.length;
    if(phone!=10)
    {
        alert("Please enter a valid phone number")
        z=false;
    }

    x=0;

    if(document.getElementById("M").checked)
    {
        x++;
    } 
    if(document.getElementById("F").checked)
    {
        x++; 
    }
    if(x==0)
    {
    alert('Select your gender');
    z=false;
    }

    var password=document.getElementById("password").value;
    var re_password=document.getElementById("re-password").value;
    if(password!==re_password)
    {
        alert("password and confirm password dont match \n please enter again");
        z=false;

    }
console.log(z);
    if(z)
    {
        alert("Successfully registered");
        return true;
    }
    else{
        return false;
    }


    

}
