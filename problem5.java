public class problem5
{
    public static void main(String args[])
    {
        int y=2520;
        while(true)
        {
            
            if(y%11==0 && y%12==0 && y%13==0 && y%14==0 && y%15==0 && y%16==0 && y%17==0 && y%18==0 && y%19==0 && y%20==0)
            {
                System.out.println(y);
                break;
            }
            y++;
            
        }
        
    }
}