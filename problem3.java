public class problem3
{
    public static void main (String args[])
    {
        long i=0L;
        long n = 600851475143L;

        loop1: for(i=n; i>1; i=i-2)
        {
            int c=0;
            int sr=(int)Math.sqrt(i);
            for(int f=3;f<sr;f++)
            {
           
              if(sr%f==0)
              {
               c++;
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
