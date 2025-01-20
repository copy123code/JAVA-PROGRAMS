/*PRINT PYRAMID SHAPE USING * SYMBOLS*/

import java.util.Scanner;
class p21	
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the value");
int n=sc.nextInt();

for(int i=1;i<=n;i++)
{
for(int j=n;j>=1;j--)
{

if(i>=j)
{

System.out.print("* ");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
}
}
