public class problem3
{
    public static void main (String args[])
    {
        long i=0L;
        long n = 600851475143L;

        loop1: for(i=n; i>1; i=i-2)
        {
            if(n%i==0)
            {
                int c=0;
                for(int f=2;f<=Math.sqrt(i);f++)
                {
                    if(i%f==0)
                    {
                        continue loop1;
                    }
                }
                if(c==0)
                {
                    System.out.println(i);
                    break loop1;
                }
            }
        }
        
    }
}
