import java.io.*;
class Table
{
public static void main(String a[])throws IOException
{
BufferedReader c=new BufferedReader(new InputStreamReader(System.in));

System .out.println("Enter the Number for which its table has to be printed ");

int x=Integer.parseInt(c.readLine());

for(int i=1;i<=10;i++)
{
int t=x*i;

System.out.println(+ x + "*" + i + "=" + t );

}

}

}