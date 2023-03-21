import java.util.Scanner;
class Rev
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the number:");
int num=input.nextInt();
int rev=0,rem;
while(num>0)
{
rem=num%10;
rev=(rev*10)+rem;
num=num/10;
}
System.out.println("Reverse:" +rev);
}
}

