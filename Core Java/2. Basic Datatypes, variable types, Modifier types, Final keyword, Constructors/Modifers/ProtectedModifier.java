//protected : can be accessed outside package only through inheritance.

package mypack;
import otherpack.*;
class ProtectedModifier extends A
{
    public static void main(String args[])
    {
    ProtectedModifier obj=new ProtectedModifier();
    obj.show();
    }
}