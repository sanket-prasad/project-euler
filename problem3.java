public class problem3
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
    
    
    public static void main (String args[])
    {
        long i=0L;
        long n = 600851475143L;

        for(i=(int)Math.sqrt(n); i>1; i--)
        {
            if(n%i==0 && isprime(i))
            {
              System.out.println(i);
              break;
            }
        }


    }
}
