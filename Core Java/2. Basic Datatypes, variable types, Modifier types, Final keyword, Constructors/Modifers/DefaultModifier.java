package mypack;  
import otherpack.*;  
class DefaultModifier{  
  public static void main(String args[]){  
   B obj = new B();
   obj.show(); 
  }  
}  

//This will give error as default cannot be acessed outside package.
