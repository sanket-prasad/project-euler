public class problem9
{
    public static void main(String args[])
    {
        int s=1000;
        int p=1;

       loop1: for(int a=1;a<=s/3;a++)
       {
           for(int b=s/3;b<=2*(s/3);b++)
           {
               int c=s-(a+b);
               if(c*c==(a*a)+(b*b))
               {
                   p=a*b*c;
                   break loop1;
               }
           }
       }
       System.out.println(p);
    }
}
