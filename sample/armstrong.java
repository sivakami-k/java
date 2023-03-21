import java.util.Scanner;
class Armstrong
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the number:");
int num=input.nextInt();
int n,rem,res=0;
n=num;
while(n!=0)
{
rem=n%10;
res=res+(rem*rem*rem);
n=n/10;
}
if(res==num)
System.out.println("Armstrong number");
else
System.out .println("Not an armstrong number");
}

}

