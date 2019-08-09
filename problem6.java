public class problem6
{
    public static void main(String args[])
    {
        int sum, sumsq, psum;
        sum=0;sumsq=0;psum=0;
        for(int i=1;i<=100;i++)
        {
            sum=sum+i;
            sumsq=sumsq+(i*i);
        }
        psum=sum*sum;
        System.out.println(psum-sumsq);
    }
}