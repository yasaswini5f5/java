import java.io.*;
public class CmdlineArgs extends Object {
    public static void main(String args[]) {
        CmdlineArgs obj = new CmdlineArgs();
        if(args.length!=2)
        {
        System.out.println("Invalid number of arguments  \n you need to pass 2 positive integers ");
        }
        else
        {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int z = x + y;
            System.out.println("The class name is:- " + obj.getClass());
            System.out.println("Sum of " + " and " + y + "  is " + z);
        }
    }
}
