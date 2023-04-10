import java.util.Scanner;
class Employee
{
int eid,ns,gs,me,te,pf;
String ename,dep;
Employee(String name,int id,String dept,int grs,int med,int tr,int epf)
{
ename=name;
eid=id;
dep=dept;
gs=grs;
me=med;
te=tr;
pf=epf;
}
void display()
{
ns=gs-(me+te+pf);
System.out.println("Employee Name:" +ename);
System.out.println("Employee ID:" +eid);
System.out.println("Net Salary:" +ns);
System.out.println("Department:" +dep);
}
}

class Main
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
Employee em[]=new Employee[5];
for(int i=0;i<5;i++)
{
System.out.println("Enter Name:");
String n=input.next();
System.out.println("Enter ID:");
int id=input.nextInt();
System.out.println("Enter Department:");
String d=input.next();
System.out.println("Gross Salary:");
int g=input.nextInt();
System.out.println("Medical Elevence:");
int m=input.nextInt();
System.out.println("Travelling Elevence:");
int t=input.nextInt();
System.out.println("PF:");
int p=input.nextInt();
em[i]=new Employee(n,id,d,g,m,t,p);
System.out.println("------------");
}
for(int i=0;i<5;i++)
{
em[i].display();
}
}}
