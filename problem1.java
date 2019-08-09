public class problem1
{
    public static void main(String args[])
    {
        int s=0;
        for(int x=3; x<1000; x++)
        {
            if(x%3==0 || x%5==0)
            s=s+x;
        }
        System.out.println(s);
    }
}