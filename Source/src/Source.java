import java.util.Scanner;

class Source{

public static void main(String[] args){
Scanner in=new Scanner(System.in);
int count=0;
System.out.println("enter string");
String str=in.nextLine();

for(int i=0;i<str.length();i++)
{
   if(str.charAt(i)=='a'|| str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o'
|| str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || 
str.charAt(i)=='O' || str.charAt(i)=='U')
count++;
}


StringBuffer rev=new StringBuffer(str);
char ch;
int k=0;
for(int j=str.length()-1;j>=0;j--)
{
  ch=str.charAt(j);
  
  rev.setCharAt(k,ch);
  k++;
}

System.out.println(rev+" "+count);

}

}

