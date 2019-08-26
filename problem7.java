public class problem7
{
    public static boolean isprime(long i)
    {   
            long a=i;
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
        int cc=0;
        int i=1;
        loop1:while(true)
        {
            if(isprime(i))
            {
                cc++;
            }
            if(cc==10001)
            {break;}
            i=i+2;
        }
        System.out.println(i);
    }
}
