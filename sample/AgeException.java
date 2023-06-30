import java.util.Scanner;
class AgeException extends Exception
{
        AgeException(String str)
        {
                super(str);
        }
}

class AgeValid
{
        void validate(int age) throws AgeException
        {
                if (age<18)
                {
                        throw new AgeException("Not eligible for voting!!");
                }
                else
                {
                        System.out.println("Eligible for voting");
                }
        }
}

public class Main
{
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
                try
                {
                        System.out.println("Enter age:");
                        int ag=sc.nextInt();
                        AgeValid av=new AgeValid();
                        av.validate(ag);
                }
                catch(AgeException e)
                {
                        System.out.println("Below 18  " +e);
                }
        }
}