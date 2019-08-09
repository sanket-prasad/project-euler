public class problem4
{
    public static void main(String args[])
    {
        int gp=0;
        for(int x=999;x>=100;x--)
        {
            for(int y=x; y>=100;y--)
            {
                int p,q,r;
                p=0;q=0;r=0;
                p=q=x*y;
                while(p>0)
                {
                    int d=p%10;
                    r=r*10+d;
                    p=p/10;
                }
                if(r==q && q>gp)
                {
                    gp=q;
                }
            }
        }
        System.out.println(gp);

    }
}