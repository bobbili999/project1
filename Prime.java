class Prime
{
public static void main ( String args[])
{
int a=5,i,count=0;
 for(i=1;i<=a;i++)
{
if(a%i==0)
count++;
}
if(count==2)
System.out.println("the number is prime");
else
System.out.println("the number is not prime");
}
}