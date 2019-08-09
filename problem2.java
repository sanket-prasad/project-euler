public class problem2
{
    public static void main(String args[])
    {
        int s,a,b,c;
        a=1; b=2; c=0; s=2;
        while(true)
        {
            c=a+b;
            a=b;
            b=c;
            if(c>4000000)
            {break;}
            else if(c%2==0)
            {
                s=s+c;
            }
        }
        System.out.println(s);
    }
}