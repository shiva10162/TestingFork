import java.util.*;

class StaticClassExample
{
    static int a=0;

    //static class declaration
    static class ClsInner
    {
        //method of static class
        public void dispMessage()
        {
            a=20;
            System.out.println("Value of a: " + a);
        }
    }

    //main()
    public static void main(String []s)
    {
        //create object of static inner class
        StaticClassExample.ClsInner objClsInner=new StaticClassExample.ClsInner();

        objClsInner.dispMessage();
    }
}
