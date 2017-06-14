import java.io.*;
import java.util.*;
class poseve
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        
        if(a>0)
        {
            System.out.println("positive");
        }
        else if( a<0)
        {
            System.out.println("negative");
        }
       else
        {
            System.out.println("zero");
        }
        
    }
}
