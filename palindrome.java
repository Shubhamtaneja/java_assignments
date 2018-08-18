import java.util.Scanner;
class Palindrome
{
 public static void main(String args[])
 {
  int n,r,temp,sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter No");
  n=sc.nextInt();
  temp=n;
  while(n>0)
  {
    r=n%10;
	sum=sum*10+r;
	n=n/10;
  }
  if(temp==sum)
  {
   System.out.println(temp+" is a palindrome no");
  }
  else
  {
   System.out.println("No it is not a palindrome");
  }
 }
}