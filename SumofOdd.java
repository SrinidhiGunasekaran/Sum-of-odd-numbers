import java.io.*;
class SumofOdd
{
public static void main(String args[])
{
try
{
DataInputStream in=new DataInputStream(System.in);
int end,i,sum=0;
end=Integer.parseInt(in.readLine());
for(i=1;i<=end;i++)
{
if(i%2!=0)
{
sum=sum+i;
}
}
System.out.println(sum);
}
catch(Exception e)
{
}
}
}
