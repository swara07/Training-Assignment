import java.io.*;  
class M{  
 void method()throws IOException{  
  throw new IOException("device error");  
 }  
}  
class ThrowsKeyword{  
   public static void main(String args[]){  
    try{  
     M m=new M();  
     m.method();  
    }catch(Exception e){System.out.println("exception handled");}     
   
  }  
}  

/*NOTE:
throw : throw keyword is used throw an exception explicitly in the code, inside the function or the block of code.
trows : throws keyword is used in the method signature to declare an exception which might be thrown by the function while the execution of the code.