public class problem7
{
    public static void main(String args[])
    {
        int c=0; int cc=0;int a=0;
        int i=1;
        loop1:while(true)
        {
            loop2:for(int f=1;f<=i;f++)
            {
                if(i%f==0)
                {
                    c++;
                    if(c==3)
                    break loop2;

                }

            }
            if(c==2)
            cc++;
            if(cc==10001)
            {
              a=i;
              break loop1;
            }
            i=i+2;
        }
        System.out.println(a);
    }
}