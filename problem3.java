public class problem3
{
    public static void main (String args[])
    {
        long g=0Lx;
        long n = 600851475143L;

        loop1: for(long f=n; f>1; f=f-2)
        {
           
           if(n%f==0)
           {
              int c=0;
              for(long x=1;x<=f;x++)
              {
                  if(f%x==0)
                  {
                      c++;
                      if(c==3)
                      continue loop1;
                  }
              }
              if(c==2 && f>g)
              g=f;

           } 
        

        }
        System.out.println(g);
        
    }
}