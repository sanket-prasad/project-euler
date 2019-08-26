public class problem10
{
    public static boolean isprime(int i)
    {   
            int a=i;
            for(int f=3;f<=(int)Math.sqrt(a);f=f+2)
            {
                if(a%f==0)
                {
                    return false;
                }

            }
            return true;
    }
    
    
    public static void main(String args[])
    {
        long s=2L;
        for(int i=3;i<=2000000;i=i+2)
        {
            if(isprime(i))
            s=s+i;
        }
        System.out.println(s);
    }
}