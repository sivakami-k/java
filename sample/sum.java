import java.util.Scanner;
class Sum
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the number:");
int num=input.nextInt();
int sum=0,rem;
while(num>0)
{
rem=num%10;
sum=sum+rem;
num=num/10;
}
System.out.println("Sum:" +sum);
}}

~
