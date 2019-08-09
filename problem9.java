public class problem9
{
    public static void main(String args[])
    {
        int a,b,c,x,y,z,p;
        a=1;b=2;c=3;x=0;y=0;z=0;

        while(c<1000 && b<c && a<b)
        x=a*a;
        y=b*b;
        z=c*c;
        if(x+y==z)
        {
            if(a+b+c==1000)
            {
                p=a*b*c;
            }
        }
        c++;
        b++;
        a++;
    }
}