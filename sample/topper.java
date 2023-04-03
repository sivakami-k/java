import java.util.Scanner;
class Topper
{
float sb1,sb2,sb3,total,p;
String name;
int rn;
Topper(float s1,float s2,float s3,int r,String nm)
{
sb1=s1;
sb2=s2;
sb3=s3;
rn=r;
name=nm;
total=sb1+sb2+sb3;
}
void display()
{
p=(total/300)*100;
System.out.println("Name:" +name);
System.out.println("Roll No:" +rn);
System.out.println("Percentage:" +p);
}
}
class Main
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
Topper tp[]=new Topper[5];
for(int i=0;i<5;i++)
{
System.out.println("Enter Name:");
String n=input.next();
System.out.println("Enter Roll No:");
int r=input.nextInt();
System.out.println("Enter Mark1:");
float m1=input.nextInt();
System.out.println("Enter Mark2:");
float m2=input.nextInt();
System.out.println("Enter Mark3:");
float m3=input.nextInt();
tp[i]=new Topper(m1,m2,m3,r,n);
System.out.println("--------------");
}

int flag=1;
float t=tp[0].total;
for(int i=0;i<5;i++)
{
if(tp[i].total>t)
{
flag=i+1;
t=tp[i].total;
}
}
System.out.println("__TOPPER__");
tp[flag-1].display();
}
}

